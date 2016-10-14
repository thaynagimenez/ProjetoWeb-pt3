package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConexaoDAO {

    private String nome;
    private String email;
    private String senha;
    
    private ConexaoDAO () {}

    public void setNome (String nome) { this.nome = nome; }
    public String getNome () { return this.nome; }
    
    public void setEmail (String email) {this.email = email;}
    public String getEmail () {return this.email; }
    
    public void setSenha (String senha) {this.senha = senha; }
    public String getSenha (String senha) {return this.senha; }
    
    public static List <ConexaoDAO> get() {
        List <ConexaoDAO> resultado = new ArrayList <ConexaoDAO> ();
        Connection conn;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Projeto2","postgres","thayna");
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM Usuario;");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                ConexaoDAO conexao = new ConexaoDAO();
                conexao.setNome(rs.getString("nome"));
                conexao.setEmail(rs.getString("email"));
                conexao.setSenha(rs.getString("senha"));
                
                resultado.add(conexao);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public static ConexaoDAO get(String senha) {
        Connection conn;
        ConexaoDAO c = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Projeto2","postgres","thayna");
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM Usuario WHERE senha=?;");
            ps.setString(1, senha);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                c = new ConexaoDAO();
                c.setNome(rs.getString("nome"));
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    public static void delete(String senha) {
        Connection conn;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Projeto2","postgres","thayna");
            PreparedStatement ps = conn.prepareStatement(
                    "DELETE FROM Usuario WHERE senha=?;");
            ps.setString(1, senha);
            ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update (String senha, String nome) {
        Connection conn;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Projeto2","postgres","thayna");
            PreparedStatement ps = conn.prepareStatement(
                    "UPDATE Usuario SET nome=? WHERE senha=?;");
            ps.setString(1, nome);
            ps.setString(2, senha);
            ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insert (String nome) {
        Connection conn;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Projeto2","postgres","thayna");
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO Usuario(nome) VALUES (?);");
            ps.setString(1, nome);
            ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
