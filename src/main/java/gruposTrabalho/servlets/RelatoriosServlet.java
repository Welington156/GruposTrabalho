/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package gruposTrabalho.servlets;

import gruposTrabalho.pessoa.PessoaBeanLocal;
import gruposTrabalho.pessoa.Pessoa;
import gruposTrabalho.util.Util;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

/**
 *
 * @author welington
 */
@Transactional
@WebServlet(name = "Relatorios", urlPatterns = {"/Relatorios"})
public class RelatoriosServlet extends HttpServlet {

    @Inject
    private PessoaBeanLocal pessoaBean;

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
      
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            
            
//            out.println("<h1>Consultas 1 </h1>");
//            List<Pessoa> pessoasTodasQuery = pessoaBean.findAllPessoaQuery();
//            out.println("<p><pre>"+Util.toJson(pessoasTodasQuery)+"<p><pre>");
//            List<Pessoa> pessoasTodasTyped = pessoaBean.findAllPessoaTyped();
//            out.println("<p><pre>"+Util.toJson(pessoasTodasTyped)+"<p><pre>");
//            List<Pessoa> pessoasTodasNamed = pessoaBean.findAllPessoaNamed();
//            out.println("<p><pre>"+Util.toJson(pessoasTodasNamed)+"<p><pre>");

//            out.println("<h1>Consultas 2 </h1>");
//            List<String> nomesPessoasQuery = pessoaBean.findNomePessoaQuery();
//            out.println("<p><pre>"+Util.toJson(nomesPessoasQuery)+"<p><pre>");
//            List<String> nomesPessoasTyped = pessoaBean.findNomePessoaTyped();
//            out.println("<p><pre>"+Util.toJson(nomesPessoasTyped)+"<p><pre>");
//            List<String> nomesPessoasNamed = pessoaBean.findNomePessoaNamed();
//            out.println("<p><pre>"+Util.toJson(nomesPessoasNamed)+"<p><pre>");


//            out.println("<h1>Consultas 3 </h1>");
//            List<Pessoa> pessoasNomeEnderecoQuery = pessoaBean.findNomeEnderecoQuery();
//            out.println("<p><pre>"+Util.toJson(pessoasNomeEnderecoQuery)+"<p><pre>");
//            List<Pessoa> pessoasNomeEnderecoTyped = pessoaBean.findNomeEnderecoTyped();
//            out.println("<p><pre>"+Util.toJson(pessoasNomeEnderecoTyped)+"<p><pre>");   
//            List<Object[]> pessoasNomeEnderecoNamed = pessoaBean.findNomeEnderecoNamed();
//            out.println("<p><pre>"+Util.toJson(pessoasNomeEnderecoNamed)+"<p><pre>");
            

//            out.println("<h1>Consultas 4 </h1>");
//            List<Pessoa> pessoasInAvendaQuery = pessoaBean.findPessoaInAvenidaQuery();
//            out.println("<p><pre>"+Util.toJson(pessoasInAvendaQuery)+"<p><pre>");
//            List<Pessoa> pessoasInAvendaTyped = pessoaBean.findPessoaInAvenidaTyped();
//            out.println("<p><pre>"+Util.toJson(pessoasInAvendaTyped)+"<p><pre>");
//            List<Pessoa> pessoasInAvendaNamed = pessoaBean.findPessoaInAvenidaNamed();
//            out.println("<p><pre>"+Util.toJson(pessoasInAvendaNamed)+"<p><pre>");

            out.println("<h1>Consultas 5 </h1>");
            List<Pessoa> pessoasNotPracaQuery = pessoaBean.findPessoaNotPracaQuery();
            out.println("<p><pre>"+Util.toJson(pessoasNotPracaQuery)+"<p><pre>");
            List<Pessoa> pessoasNotPracaTyped = pessoaBean.findPessoaNotPracaTyped();
            out.println("<p><pre>"+Util.toJson(pessoasNotPracaTyped)+"<p><pre>");
            List<Pessoa> pessoasNotPracaNamed = pessoaBean.findPessoaNotPracaNamed();
            out.println("<p><pre>"+Util.toJson(pessoasNotPracaNamed)+"<p><pre>");


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