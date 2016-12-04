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
import java.util.ArrayList;
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
    private String endereco;

    private static Connection conn;

    private Usuario() {

        try {

            Class.forName("org.postgresql.Driver");
            this.conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Projeto2", "postgres", "thayna");

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

        System.out.println("LOGIn : " + login);
        
        ResultSet rs = stm.executeQuery("SELECT nome,senha FROM public.\"Usuarios\" WHERE login='" + login + "';");
        Usuario usu = new Usuario();
        usu.setLogin(login);
        
//        System.out.println(rs.getString("nome"));
//        usu.setNome(rs.getString("nome"));
//        usu.setSenha(rs.getString("senha"));
        return usu;
    }

    public void update(String login, String senha, String nome, String endereco) throws SQLException {
        PreparedStatement ps = this.conn.prepareStatement(
                "UPDATE Usuarios SET nome=" + login + ",senha=" + senha
                + ",endereco=" + endereco + "WHERE login=" + login + ";");

        ps.executeUpdate();
    }
    
    public void insert(String nome, String login, String senha, String endereco) throws SQLException {

        PreparedStatement ps = this.conn.prepareStatement(
                "INSERT INTO public.\"Usuarios\"(login, senha, nome, endereco) "
                + "VALUES ('" + login + "','" + senha + "','" + nome + "','" + endereco + "');");

        ps.executeUpdate();

    }

    public void delete(String login) throws SQLException {
        PreparedStatement ps = this.conn.prepareStatement(
                "DELETE FROM Usuarios WHERE login=" + login + ";");

        ps.executeUpdate();
    }

    public boolean validaUsuario(String login, String senha) throws SQLException {

        PreparedStatement ps = conn.prepareStatement(
                "SELECT * FROM public.\"Usuarios\" WHERE login='"+login+"';");

        ResultSet rs = ps.executeQuery();
        ArrayList<String> r = new ArrayList<>();        
        while (rs.next()) {
            String s = rs.getString("senha");
            r.add(s);
        }
        return r.contains(senha);

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
