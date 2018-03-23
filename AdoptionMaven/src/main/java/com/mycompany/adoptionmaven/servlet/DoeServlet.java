/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adoptionmaven.servlet;



import com.mycompany.adoptionmaven.doar;
import com.mycompany.adoptionmaven.servlet.util.SessaoHibernate;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author luizcanf
 */
public class DoeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("RECEBENDO O USUARIO DO FORM HTML");
        doar user = new doar();
        user.setNome(request.getParameter("nome"));
        user.setTipoanimal(request.getParameter("tipoanimal"));
        user.setIdade(request.getParameter("idade"));
        user.setCor(request.getParameter("cor"));
        user.setEmaildono(request.getParameter("emaildono"));
        
        try {
        System.out.println("SALVANDO USUARIO");
        Session sessao = SessaoHibernate.nova();
        Transaction tx = sessao.beginTransaction();
        sessao.save(user);
        tx.commit();
        sessao.close();
        System.out.println("USUARIO SALVO");
        } catch (Exception ex) {
            ex.printStackTrace();
            response.sendRedirect("erro.html");
        }
        // redirecionar p outra página
        response.sendRedirect("Perfil.jsp");
    }

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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}