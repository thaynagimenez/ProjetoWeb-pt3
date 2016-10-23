/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ricardo
 */
public class Usuario {

    private static Usuario usuario;
    private String nome;
    private String login;
    private String senha;

    private static Connection conn;

    private Usuario() {

        try {

            Class.forName("org.postgresql.Driver");
            this.conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Projeto2", "postgres", "admin");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Publicacao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Publicacao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Usuario getInstance() {
        if (usuario == null) {
            usuario = new Usuario();
        }
        return usuario;
    }

    public void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Usuario get(String login) throws SQLException {
        Statement stm = conn.createStatement();

        ResultSet rs = stm.executeQuery("SELECT * FROM Usuarios WHERE login=" + login + ";");
        Usuario usu = new Usuario();
        return usu;
    }

    public void update(String login, String senha, String nome) throws SQLException {
        PreparedStatement ps = this.conn.prepareStatement(
                "UPDATE Usuarios SET nome=" + login + ",senha=" + senha
                + "WHERE login=" + login + ";");

        ps.executeUpdate();
    }

    public void insert(String nome, String login, String senha) throws SQLException {

        PreparedStatement ps = this.conn.prepareStatement(
                "INSERT INTO public.\"Usuarios\"(login, senha, nome) "
                + "VALUES ('" + login + "','" + senha + "','" + nome + "');");

        ps.executeUpdate();

    }

    public void delete(String login) throws SQLException {
        PreparedStatement ps = this.conn.prepareStatement(
                "DELETE FROM Usuarios WHERE login=" + login + ";");

        ps.executeUpdate();
    }

    public boolean validaUsuario(String login, String senha) throws SQLException {

        System.out.println("login:" + login);
        System.out.println("senha:" + senha);

        PreparedStatement ps = conn.prepareStatement(
                "SELECT senha FROM public.\"Usuarios\" WHERE login=?;");
        ps.setString(1, login);
        ResultSet rs = ps.executeQuery();
//        System.out.println("rs --> " + rs.getString("senha"));
        //return rs.getString("senha").equals(senha);
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
