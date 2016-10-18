/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ricardo
 */
public class Usuario {

    String nome;
    String senha;
    String login;

    public static void delete(String senha) {
        Connection conn;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Projeto2", "postgres", "thayna");
            PreparedStatement ps = conn.prepareStatement(
                    "DELETE FROM Usuario WHERE senha=?;");
            ps.setString(1, senha);
            ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(String senha, String nome) {
        Connection conn;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Projeto2", "postgres", "thayna");
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

    public static void insert(String nome) {
        Connection conn;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Projeto2", "postgres", "thayna");
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO Usuario(nome) VALUES (?);");
            ps.setString(1, nome);
            ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    
     public void Usuario() {
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return this.login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha(String senha) {
        return this.senha;
    }
}
