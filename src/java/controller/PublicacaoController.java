/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        String nome = req.getParameter("nome"),
                id = req.getParameter("id");
        res.sendRedirect("cidade");
    }

}