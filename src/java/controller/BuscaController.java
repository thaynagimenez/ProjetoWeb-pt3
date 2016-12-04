/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Publicacao;
import model.Usuario;

/**
 *
 * @author thayn
 */
@WebServlet(name = "busca", urlPatterns = {"/busca"})
public class BuscaController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Publicacao> publicacoes;
        try {
            publicacoes = Publicacao.getInstance().get();

            request.setAttribute("publicacoes", publicacoes);

        } catch (SQLException ex) {
            Logger.getLogger(PerfilController.class.getName()).log(Level.SEVERE, null, ex);
        }

        request.getRequestDispatcher("/WEB-INF/busca.jsp")
                .forward(request, response);
    }
}
