/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.OutputStream;
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
@WebServlet(name = "ler", urlPatterns = {"/ler"})
public class LerController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String titulo = request.getParameter("titulo");
        String texto = request.getParameter("texto");
        
        System.out.println(titulo + " = " + texto);

        request.setAttribute("titulo", titulo);
        request.setAttribute("texto", texto);
        
        request.getRequestDispatcher("/WEB-INF/ler.jsp")
                .forward(request, response);
    }
}
