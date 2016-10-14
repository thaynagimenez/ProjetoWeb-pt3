
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PublicacaoDAO {

    public static List<Publicacao> get() {
        List<Publicacao> resultado = new ArrayList<Publicacao>();
        Connection conn;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://#########", "root", "");
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM Publicacoes;");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Publicacao publicacao = new Publicacao();
                publicacao.setTitulo(rs.getString("titulo"));
                publicacao.setTexto(rs.getString("texto"));
                resultado.add(publicacao);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public static Publicacao get(int id) {
        Connection conn;
        Publicacao publicacao = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://#########", "root", "");
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM Publicacoes WHERE id=?;");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                publicacao = new Publicacao();
                publicacao.setTitulo(rs.getString("titulo"));
                publicacao.setTexto(rs.getString("texto"));
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return publicacao;
    }

    public static void delete(int id) {
        Connection conn;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://#########", "root", "");
            PreparedStatement ps = conn.prepareStatement(
                    "DELETE FROM Publicacoes WHERE id=?;");
            ps.setInt(1, id);
            ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(int id, String nome) {
        Connection conn;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://#########", "root", "");
            PreparedStatement ps = conn.prepareStatement(
                    "UPDATE Publicacoes SET titulo=? WHERE texto=?;");
            ps.setString(1, nome);
            ps.setInt(2, id);
            ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insert(String texto) {
        Connection conn;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://#########", "root", "");
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO Publicacoes VALUES (?);");
            ps.setString(1, texto);
            ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
