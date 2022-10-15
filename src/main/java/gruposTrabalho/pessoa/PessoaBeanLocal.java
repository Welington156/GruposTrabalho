/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package gruposTrabalho.pessoa;

import gruposTrabalho.grupo.Grupo;
import java.time.LocalDate;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author welington
 */
@Local
public interface PessoaBeanLocal {

    public void salvar(Pessoa pessoa);

    public List<Pessoa> findAllPessoaQuery();

    public List<Pessoa> findAllPessoaTyped();

    public List<Pessoa> findAllPessoaNamed();

    public List<String> findNomePessoaQuery();

    public List<String> findNomePessoaTyped();

    public List<String> findNomePessoaNamed();

    public List<Pessoa> findNomeEnderecoQuery();

    public List<Pessoa> findNomeEnderecoTyped();

    public List<Object[]> findDataMembroGrupos(Long idGrupo, LocalDate dataInicio);
    
    public List<Object[]> findDataMembroGrupos(LocalDate dataInicio);
    
    public List<Object[]> findNomeEnderecoNamed();

    public List<Pessoa> findPessoaInAvenidaQuery();

    public List<Pessoa> findPessoaInAvenidaTyped();

    public List<Pessoa> findPessoaInAvenidaNamed();

    public List<Pessoa> findPessoaNotPracaQuery();

    public List<Pessoa> findPessoaNotPracaTyped();

    public List<Pessoa> findPessoaNotPracaNamed();

    public List<Object[]> findPessoaNomeTelefoneQuery();

    public List<Object[]> findPessoaNomeTelefoneTyped();

    public List<Object[]> findPessoaNomeTelefoneNamed();

    public List<Pessoa> findPessoaByDate(LocalDate dataInicio, LocalDate dataFim);

    public List<Pessoa> findPessoaTelefoneVazio();
    
    public List<String> findQuantidadeTelefonesPorPessoa();
    
    public List<Grupo> findGruposInativos();
    
    public List<String[]> findLideresGrupos();
    
    public List<String> findMembrosGrupo(String nomeGrupo);
    
    public List<Grupo> findGruposPorLider(String nomeLider);
    
    public List<Object[]> findDatasAtuacaoGrupo(String nomeMembro);
    
    public List<Grupo> findGrupoByNome(String nomeGrupo);
    
    public List<Object[]> findNomeGrupoQuantidadeMembros();
    
    public List<Object[]> findNomeGrupoPorTotalAtuacoes(Long total);
    
    public List<String> findNomePessoaPorDataEntradaEmGrupo(Long grupoId, LocalDate dataInicio);
    
    public List<String[]> findGruposEPessoaSemDataTermino();
    
    public List<String[]> findLiderMembrosGrupos();
    

}