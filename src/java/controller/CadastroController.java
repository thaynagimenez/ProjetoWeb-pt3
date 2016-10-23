/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
 * @author Ricardo
 */
@WebServlet(name = "cadastro", urlPatterns = {"/cadastro"})
public class CadastroController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter writer = response.getWriter();
        request.getRequestDispatcher("/WEB-INF/cadastro.jsp").forward(request, response);

    }

    public void doPost(HttpServletRequest req,
            HttpServletResponse res) throws IOException {

        String nome = req.getParameter("nome");
        String login = req.getParameter("email");
        String senha = req.getParameter("senha");
        String senha2 = req.getParameter("senha2");
        
        System.out.println("email :" +  login);
        System.out.println("nome :" + nome);
        System.out.println("senha :" + senha+"/"+senha2);
        try {
            if (senha.equals(senha2)) {
                Usuario.getInstance().insert(nome, login, senha);
                res.sendRedirect("home");
            } else {
                res.setStatus(HttpServletResponse.SC_NOT_FOUND);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PublicacaoController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
