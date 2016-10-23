package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Publicacao {

    String titulo;
    String texto;

    private static AtomicLong idCounter = new AtomicLong();
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

    public void insert(String text, String tit, File file) throws SQLException, FileNotFoundException, IOException {

        String id = createID();
        System.out.println("ID : "+id);
        FileInputStream fis = new FileInputStream(file);
        PreparedStatement ps = this.conn.prepareStatement("INSERT INTO public.\"IMG_Artigos\"(id,img) VALUES (?, ?)");
        ps.setString(1, id);
        ps.setBinaryStream(2, fis, (int) file.length());
        ps.executeUpdate();
        fis.close();

        ps = this.conn.prepareStatement(
                "INSERT INTO public.\"Artigos\"(id,titulo, texto) "
                + "VALUES ('" + id + "','" + tit + "','" + text + "');");

        ps.executeUpdate();

    }

    public void delete(String tit) throws SQLException {
        PreparedStatement ps = this.conn.prepareStatement(
                "DELETE FROM Artigo WHERE tit=" + tit + ";");

        ps.executeUpdate();
    }

    public static String createID() {
        return String.valueOf(idCounter.getAndIncrement());
    }

}
