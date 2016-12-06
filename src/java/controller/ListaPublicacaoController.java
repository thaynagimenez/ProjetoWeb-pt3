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
 * @author thayn
 */
@WebServlet(name = "ListaPublicacaoController", urlPatterns = {"/ListaPublicacaoController"})
public class ListaPublicacaoController extends HttpServlet {

    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        
        out.println("<c:forEach items=\"${lista}\" var=\"lista\">");
        out.println("<div class=\"col-md-3 col-sm-6\">");
        out.println("<div class=\"sw-content-block sw-block-connect\">");
        out.println("<div class=\"sw-block-icon\"><img src=\"menu.png\" width=\"99%\"/></div>");
        out.println("<form action=\"ler\" method=\"POST\" accept-charset=\"utf-8\">");
        out.println("<a href=\"ler?titulo=${lista.titulo}&texto=${lista.texto}\" style=\"color: black\"><h3>\"${lista.titulo}\"</h3></a>\n" +
"");
        out.println("</form>");
        out.println("</div>");
        out.println("</div>");
        out.println("</c:forEach>");
               
        
    }
}
