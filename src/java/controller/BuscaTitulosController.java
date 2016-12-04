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
import org.json.JSONArray;
import org.json.JSONObject;
//import com.google.gson.Gson;

/**
 *
 * @author thayn Essa classe deve buscar somente os titulos dos artigos
 */
@WebServlet(name = "buscaTitulos", urlPatterns = {"/buscaTitulos"})
public class BuscaTitulosController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String tit = request.getParameter("titulo");
        if (tit != "") {
            System.out.println(tit);
            try {
                List<Publicacao> publicacoes = Publicacao.getInstance().getByTitulo(tit);

                PrintWriter writer = response.getWriter();

                JSONArray pubs = new JSONArray();

                for (int i = 0; i < publicacoes.size(); i++) {
                    JSONObject p = new JSONObject();
                    p.put("titulo", publicacoes.get(i).getTitulo());
                    pubs.put(p);
                }

                writer.println(pubs.toString());

            } catch (SQLException ex) {
                Logger.getLogger(BuscaTitulosController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
