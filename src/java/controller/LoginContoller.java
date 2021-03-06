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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

/**
 *
 * @author Ricardo
 */
@WebServlet(name = "login", urlPatterns = {"/login"})

public class LoginContoller extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter writer = response.getWriter();
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest req,
            HttpServletResponse res) throws IOException {

        String login = req.getParameter("username");
        String senha = req.getParameter("password");

        try {
            if (Usuario.getInstance().validaUsuario(login, senha)) {
               req.getSession().setAttribute("logado", new Boolean(true));
               req.getSession().setAttribute("usuario",login);
               res.sendRedirect("home");
            }else{
                res.sendRedirect("cadastro");
            }            
        } catch (SQLException ex) {
            Logger.getLogger(LoginContoller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
