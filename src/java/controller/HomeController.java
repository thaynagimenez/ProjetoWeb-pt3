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

/**
 *
 * @author Ricardo
 */
@WebServlet(name = "home", urlPatterns = {"/home"})
public class HomeController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        List<Publicacao> lista;
        try {
            lista = Publicacao.getInstance().get();

            request.setAttribute("lista", lista);
            request.getRequestDispatcher("/WEB-INF/home.jsp")
                    .forward(request, response);

        } catch (SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void doPost(HttpServletRequest req,
            HttpServletResponse res) throws IOException {
    }
}
