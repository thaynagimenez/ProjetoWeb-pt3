/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

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
@WebServlet(name = "PublicacaoController", urlPatterns = {"/publicacaocontroller"})
public class PublicacaoController extends HttpServlet {


   public void doPost (HttpServletRequest req,
            HttpServletResponse res) throws IOException {
        String nome = req.getParameter("nome"),
               id = req.getParameter("id");
        res.sendRedirect("cidade");
    }


}
