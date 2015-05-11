package com.br.lp2.cinema.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Daniel Meyer | Vinicius Zamarrenho | Leticia Lopes
 */
public class Controller extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginController</title>");
            out.println("</head>");
            out.println("<body>");

            String command = request.getParameter("command");
            RequestDispatcher rd = null;

            if (command != null && !"".equals(command)) {

                if ("login".equals(command)) {
                    rd = request.getRequestDispatcher("/LoginController");
                } else {
                    if (command.startsWith("ingresso"))
                        rd = request.getRequestDispatcher("/IngressoController");
                    else if (command.startsWith("filme"))
                        rd = request.getRequestDispatcher("/FilmeController");
                    else if (command.startsWith("user"))
                        rd = request.getRequestDispatcher("/UserController");
                    else if (command.startsWith("sala"))
                        rd = request.getRequestDispatcher("/SalaController");
                    else if (command.startsWith("sessao"))
                        rd = request.getRequestDispatcher("/SessaoController");
                    else if (command.startsWith("ator"))
                        rd = request.getRequestDispatcher("/AtorController");
                }
            } else {
                rd = request.getRequestDispatcher("Erro.jsp");
            }
            rd.forward(request, response);

            out.println("</body>");
            out.println("</html>");
        }
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
