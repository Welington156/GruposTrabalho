/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package gruposTrabalho.servlets;

import gruposTrabalho.grupo.Grupo;
import gruposTrabalho.pessoa.PessoaBeanLocal;
import gruposTrabalho.pessoa.Pessoa;
import gruposTrabalho.util.Util;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
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
            
            
            out.println("<h1>Consultas 1 </h1>");
            List<Pessoa> pessoasTodasQuery = pessoaBean.findAllPessoaQuery();
            out.println("<p><pre>"+Util.toJson(pessoasTodasQuery)+"</pre></p>");
            List<Pessoa> pessoasTodasTyped = pessoaBean.findAllPessoaTyped();
            out.println("<p><pre>"+Util.toJson(pessoasTodasTyped)+"</pre></p>");
            List<Pessoa> pessoasTodasNamed = pessoaBean.findAllPessoaNamed();
            out.println("<p><pre>"+Util.toJson(pessoasTodasNamed)+"</pre></p>");

            out.println("<h1>Consultas 2 </h1>");
            List<String> nomesPessoasQuery = pessoaBean.findNomePessoaQuery();
            out.println("<p><pre>"+Util.toJson(nomesPessoasQuery)+"</pre></p>");
            List<String> nomesPessoasTyped = pessoaBean.findNomePessoaTyped();
            out.println("<p><pre>"+Util.toJson(nomesPessoasTyped)+"</pre></p>");
            List<String> nomesPessoasNamed = pessoaBean.findNomePessoaNamed();
            out.println("<p><pre>"+Util.toJson(nomesPessoasNamed)+"</pre></p>");

            out.println("<h1>Consultas 3 </h1>");
            List<Pessoa> pessoasNomeEnderecoQuery = pessoaBean.findNomeEnderecoQuery();
            out.println("<p><pre>"+Util.toJson(pessoasNomeEnderecoQuery)+"</pre></p>");
            List<Pessoa> pessoasNomeEnderecoTyped = pessoaBean.findNomeEnderecoTyped();
            out.println("<p><pre>"+Util.toJson(pessoasNomeEnderecoTyped)+"</pre></p>");   
            List<Object[]> pessoasNomeEnderecoNamed = pessoaBean.findNomeEnderecoNamed();
            out.println("<p><pre>"+Util.toJson(pessoasNomeEnderecoNamed)+"</pre></p>");
            
            out.println("<h1>Consultas 4 </h1>");
            List<Pessoa> pessoasInAvendaQuery = pessoaBean.findPessoaInAvenidaQuery();
            out.println("<p><pre>"+Util.toJson(pessoasInAvendaQuery)+"</pre></p>");
            List<Pessoa> pessoasInAvendaTyped = pessoaBean.findPessoaInAvenidaTyped();
            out.println("<p><pre>"+Util.toJson(pessoasInAvendaTyped)+"</pre></p>");
            List<Pessoa> pessoasInAvendaNamed = pessoaBean.findPessoaInAvenidaNamed();
            out.println("<p><pre>"+Util.toJson(pessoasInAvendaNamed)+"</pre></p>");

            out.println("<h1>Consultas 5 </h1>");
            List<Pessoa> pessoasNotPracaQuery = pessoaBean.findPessoaNotPracaQuery();
            out.println("<p><pre>"+Util.toJson(pessoasNotPracaQuery)+"</pre></p>");
            List<Pessoa> pessoasNotPracaTyped = pessoaBean.findPessoaNotPracaTyped();
            out.println("<p><pre>"+Util.toJson(pessoasNotPracaTyped)+"</pre></p>");
            List<Pessoa> pessoasNotPracaNamed = pessoaBean.findPessoaNotPracaNamed();
            out.println("<p><pre>"+Util.toJson(pessoasNotPracaNamed)+"</pre></p>");

            out.println("<h1>Consultas 6 </h1>");
            List<Object[]> pessoaNomeTelefoneQuery = pessoaBean.findPessoaNomeTelefoneQuery();
            out.println("<p><pre>"+Util.toJson(pessoaNomeTelefoneQuery)+"</pre></p>");
            List<Object[]> pessoaNomeTelefoneTyped = pessoaBean.findPessoaNomeTelefoneTyped();
            out.println("<p><pre>"+Util.toJson( pessoaNomeTelefoneTyped)+"</pre></p>");
            List<Object[]> pessoaNomeTelefoneNamed = pessoaBean.findPessoaNomeTelefoneNamed();
            out.println("<p><pre>"+Util.toJson(pessoaNomeTelefoneNamed)+"</pre></p>");

            out.println("<h1>Consultas 7 </h1>");
            List<Pessoa> pessoasPorData = pessoaBean.findPessoaByDate(
                    LocalDate.of(2001, Month.APRIL, 1),
                    LocalDate.of(2004, Month.APRIL, 30));
            out.println("<p><pre>"+Util.toJson(pessoasPorData)+"</pre></p>");

            out.println("<h1>Consultas 8 </h1>");

            out.println("<h1>Consultas 9 </h1>");
            List<Pessoa> pessoasTelefoneVazio = pessoaBean.findPessoaTelefoneVazio();
            out.println("<p><pre>"+Util.toJson(pessoasTelefoneVazio)+"</pre></p>");
           
            out.println("<h1>Consultas 10 </h1>");
            List<String> telefonesPorPessoa = pessoaBean.findQuantidadeTelefonesPorPessoa();
            out.println("<p><pre>"+Util.toJson(telefonesPorPessoa)+"</pre></p>");
            
            out.println("<h1>Consultas 11 </h1>");
            List<Grupo> gruposInativos = pessoaBean.findGruposInativos();
            out.println("<p><pre>"+Util.toJson(gruposInativos)+"</pre></p>");

            out.println("<h1>Consultas 12 </h1>");
            List<String[]> lideresGrupos = pessoaBean.findLideresGrupos();
            out.println("<p><pre>"+Util.toJson(lideresGrupos)+"</pre></p>");
            
            out.println("<h1>Consultas 13 </h1>");
            List<String> membrosGrupo = pessoaBean.findMembrosGrupo("Estudo IV");
            out.println("<p><pre>"+Util.toJson(membrosGrupo)+"</pre></p>");
           
            out.println("<h1>Consultas 14 </h1>");
            List<Grupo> gruposBeatriz = pessoaBean.findGruposPorLider("Beatriz Yana");
            out.println("<p><pre>"+Util.toJson(gruposBeatriz)+"</pre></p>");
          
            out.println("<h1>Consultas 15 </h1>");
            List<Object[]> atuacaoGrupos = pessoaBean.findDatasAtuacaoGrupo("Cecília Xerxes");
            out.println("<p><pre>"+Util.toJson(atuacaoGrupos)+"</pre></p>");
      
            out.println("<h1>Consultas 16 </h1>");
            List<Grupo> grupoPorNome = pessoaBean.findGrupoByNome("II");
            out.println("<p><pre>"+Util.toJson(grupoPorNome)+"</pre></p>");

            out.println("<h1>Consultas 17 </h1>");
            List<Object[]> nomeGrupoQuantidadeMembros = pessoaBean.findNomeGrupoQuantidadeMembros();
            out.println("<p><pre>"+Util.toJson(nomeGrupoQuantidadeMembros)+"</pre></p>");

            out.println("<h1>Consultas 18 </h1>");
            List<Object[]> nomeGrupoTotalAtuacoes = pessoaBean.findNomeGrupoPorTotalAtuacoes(3L);
            out.println("<p><pre>"+Util.toJson(nomeGrupoTotalAtuacoes)+"</pre></p>");

            out.println("<h1>Consultas 19 </h1>");
            List<String> nomePessoaPorDataEntradaEmGrupo = pessoaBean.findNomePessoaPorDataEntradaEmGrupo(1L, LocalDate.of(2012, Month.JANUARY, 1));
            out.println("<p><pre>"+Util.toJson(nomePessoaPorDataEntradaEmGrupo)+"</pre></p>");

            out.println("<h1>Consultas 20 </h1>");
            List<Object[]> nomemembrogrupo = pessoaBean.findDataMembroGrupos(LocalDate.of(2012,1,1));
            out.println("<p><pre>"+Util.toJson(nomemembrogrupo)+"</pre></p>");
            nomemembrogrupo = pessoaBean.findDataMembroGrupos(2l, LocalDate.of(2012,1,1));
            out.println("<p><pre>"+Util.toJson(nomemembrogrupo)+"</pre></p>");

            out.println("<h1>Consultas 21 </h1>");
            List<String[]> gruposEPessoaSemDataTermino = pessoaBean.findGruposEPessoaSemDataTermino();
            out.println("<p><pre>"+Util.toJson(gruposEPessoaSemDataTermino)+"</pre></p>");

            out.println("<h1>Consultas 22 </h1>");
            List<String[]> liderMembrosGrupos = pessoaBean.findLiderMembrosGrupos();
            out.println("<p><pre>"+Util.toJson(liderMembrosGrupos)+"</pre></p>");


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