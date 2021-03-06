/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import model.Publicacao;

@WebServlet(name = "PublicacaoController", urlPatterns = {"/publicacao"})
@MultipartConfig(location = "/tmp", fileSizeThreshold = 1024 * 1024,
        maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)
public class PublicacaoController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        
        if (session.getAttribute("logado") != null) {           
            request.getRequestDispatcher("/WEB-INF/publicacao.jsp").forward(request, response);
        }
        else {
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }

    @Override
    public void doPost(HttpServletRequest req,
            HttpServletResponse res) throws IOException, ServletException, FileNotFoundException {
        
        HttpSession session = req.getSession();
        
        if (session.getAttribute("logado") != null) {        
            String usuario = (String) session.getAttribute("usuario");

            String text = req.getParameter("texto"),
                    tit = req.getParameter("titulo");

            Part filePart = req.getPart("file"); // Retrieves <input type="file" name="file">

            InputStream is = filePart.getInputStream();

            File file = File.createTempFile("temp-file-name", ".tmp");

            OutputStream os = new FileOutputStream(file);

            byte[] buffer = new byte[1024];
            int bytesRead;
            //read from is to buffer
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            is.close();
            os.flush();
            os.close();

            try {
                Publicacao.getInstance().insert(text, tit, file, usuario);
                
            } catch (SQLException ex) {
                Logger.getLogger(PublicacaoController.class.getName()).log(Level.SEVERE, null, ex);
            }
            req.getRequestDispatcher("/WEB-INF/home.jsp")
                        .forward(req, res);
        }
        else {
            req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, res);
        }
    }

}
