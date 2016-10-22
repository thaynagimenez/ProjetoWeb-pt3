/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Publicacao;

/**
 *
 * @author Ricardo
 */
@WebServlet(name = "PublicacaoController", urlPatterns = {"/publicacao"})
public class PublicacaoController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter writer = response.getWriter();
        request.getRequestDispatcher("/WEB-INF/publicacao.jsp").forward(request, response);

    }

    public void doPost(HttpServletRequest req,
            HttpServletResponse res) throws IOException {
        String text = req.getParameter("texto"),
                tit = req.getParameter("titulo");
        try {
            Publicacao.getInstance().insert("textooo", tit);
        } catch (SQLException ex) {
            Logger.getLogger(PublicacaoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        res.sendRedirect("home");
    }

}
