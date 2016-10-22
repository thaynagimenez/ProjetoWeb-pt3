package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Publicacao {

    String titulo;
    String texto;

    private static Publicacao publicacao;
    private static Connection conn;

    private Publicacao() {

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

    public static Publicacao getInstance() {
        if (publicacao == null) {
            publicacao = new Publicacao();
        }
        return publicacao;
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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return this.texto;
    }

    public Publicacao get(String tit) throws SQLException {
        Statement stm = conn.createStatement();

        ResultSet rs = stm.executeQuery("SELECT * FROM Artigo WHERE tit=" + tit + ";");

        Publicacao pub = new Publicacao();
        pub.setTexto(rs.getString("texte"));
        pub.setTitulo(rs.getString("titulo"));

        return pub;
    }

    public void update(String text, String tit) throws SQLException {
        PreparedStatement ps = this.conn.prepareStatement(
                "UPDATE Artigo SET titulo=" + tit + ",texte=" + text
                + "WHERE titulo=" + tit + ";");

        ps.executeUpdate();
    }

    public void insert(String text, String tit) throws SQLException {

        PreparedStatement ps = this.conn.prepareStatement(
                "INSERT INTO public.\"Artigos\"(titulo, texto) "
                + "VALUES ('" + tit + "','" + text + "');");

        ps.executeUpdate();

    }

    public void delete(String tit) throws SQLException {
        PreparedStatement ps = this.conn.prepareStatement(
                "DELETE FROM Artigo WHERE tit=" + tit + ";");

        ps.executeUpdate();
    }
}
