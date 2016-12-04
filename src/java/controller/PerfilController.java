/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Publicacao;
import model.Usuario;

/**
 *
 * @author thayn
 */
@WebServlet(name = "perfil", urlPatterns = {"/perfil"})
public class PerfilController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        if (session.getAttribute("logado") != null) {

            List<Publicacao> publicacoes = null;
            try {
                publicacoes = Publicacao.getInstance().get(session.getAttribute("usuario").toString());
                
                if(publicacoes.equals(null)){
                    request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
                }

                System.out.println("Titulo" + publicacoes.get(0).getTitulo());

                request.setAttribute("publicacoes", publicacoes);

                String user = session.getAttribute("usuario").toString();
                
                System.out.println("USUARIO " + user);

                Usuario usuario = Usuario.getInstance().get(user);
                System.out.println("USUARIO 2 " + usuario.getNome());
                
                request.setAttribute("usuario", usuario);

            } catch (SQLException ex) {
                Logger.getLogger(PerfilController.class.getName()).log(Level.SEVERE, null, ex);
            }

            request.getRequestDispatcher("/WEB-INF/perfil.jsp").forward(request, response);

        } else {
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }
}
