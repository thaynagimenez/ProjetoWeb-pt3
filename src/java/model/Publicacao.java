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
import javax.websocket.Decoder.BinaryStream;

public class Publicacao {

    private String titulo;
    private String texto;
    private File imagem;

    private static AtomicLong idCounter = new AtomicLong();
    private static Publicacao publicacao;
    private static Connection conn;

    public Publicacao() {

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

    public static List<Publicacao> get() throws SQLException {
        List<Publicacao> resultado = new ArrayList<Publicacao>();

        PreparedStatement ps = conn.prepareStatement(
                "SELECT * FROM public.\"Artigos\";");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Publicacao p = new Publicacao();
            p.setTitulo(rs.getString("titulo"));
            p.setTexto(rs.getString("texto"));
            resultado.add(p);
        }
        return resultado;
    }

    /**
     * Metodo para busca por titulo
     * Criado por Ricardo
     * @param str
     * @return
     * @throws SQLException 
     */
    public static List<Publicacao> getByTitulo(String str) throws SQLException {
        List<Publicacao> resultado = new ArrayList<Publicacao>();

        PreparedStatement ps = conn.prepareStatement(
                "SELECT * FROM public.\"Artigos\" WHERE titulo like ?;");
        ps.setString(1, str + "%");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Publicacao p = new Publicacao();
            p.setTitulo(rs.getString("titulo"));
            p.setTexto(rs.getString("texto"));
            resultado.add(p);
        }
        return resultado;
    }

    public static List<Publicacao> get(String usuario) throws SQLException {
        List<Publicacao> resultado = new ArrayList<Publicacao>();

        PreparedStatement ps = conn.prepareStatement(
                "SELECT * FROM public.\"Artigos\" WHERE usuario ='" + usuario + "';");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Publicacao p = new Publicacao();
            p.setTitulo(rs.getString("titulo"));
            p.setTexto(rs.getString("texto"));
            resultado.add(p);
        }
        return resultado;
    }

    public static void delete(String titulo) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(
                "DELET * FROM public.\"Artigos\" WHERE titulo ='" + titulo + "';");
        ps.setString(1, titulo);
        ps.executeUpdate();
    }

    public static byte[] recuperaImagem(int imagem) throws Exception {
        String SQL = "select * from public.\"Artigos\" where imagem=?";
        PreparedStatement ps = conn.prepareStatement(SQL);
        ps.setInt(1, imagem);
        try {
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                return resultado.getBytes("imagem");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void insert(String text, String tit, File file, String usuario) throws SQLException, FileNotFoundException, IOException {
        String id = createID();
        System.out.println("ID : " + id);
        FileInputStream fis = new FileInputStream(file);
        PreparedStatement ps = this.conn.prepareStatement("INSERT INTO public.\"Artigos\"(id,titulo,texto,imagem,usuario) VALUES (?, ?, ?, ?, ?)");
        ps.setString(1, id);
        ps.setString(2, tit);
        ps.setString(3, text);
        ps.setBinaryStream(4, fis, (int) file.length());
        ps.setString(5, usuario);
        ps.executeUpdate();
        fis.close();
    }

    public static String createID() {
        return String.valueOf(idCounter.getAndIncrement());
    }

    /**
     * @return the imagem
     */
    public File getImagem() {
        return imagem;
    }

    public List<String> consultar(String letra) {
        int cont = 1;
        List<String> lista = new ArrayList<>();

        try {
            PreparedStatement pstm = this.conn.prepareStatement("select * from Artigos where texto like ('" + letra + "%') order by nome asc");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString("texto"));
                cont++;
            }
            pstm.close();
            this.conn.close();
        } catch (Exception e) {
            System.out.println("" + e);
        }

        return lista;
    }

}
