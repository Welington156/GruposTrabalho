/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package gruposTrabalho.pessoa;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author welington
 */
@Local
public interface PessoaBeanLocal {
    public void save(Pessoa pessoa);
    
    public List<Pessoa> findAllPessoaQuery();
    
    public List<Pessoa> findAllPessoaTyped();
    
    public List<Pessoa> findAllPessoaNamed();

    public List<String> findNomePessoaQuery();
    
    public List<String> findNomePessoaTyped();
    
    public List<String> findNomePessoaNamed();

    public List<Pessoa> findNomeEnderecoQuery();
    
    public List<Pessoa> findNomeEnderecoTyped();
    
    public List<Object[]> findNomeEnderecoNamed();
  
    public List<Pessoa> findPessoaInAvenidaQuery();
    
    public List<Pessoa> findPessoaInAvenidaTyped();
    
    public List<Pessoa> findPessoaInAvenidaNamed();
    
    public List<Pessoa> findPessoaNotPracaQuery();
    
    public List<Pessoa> findPessoaNotPracaTyped();
    
    public List<Pessoa> findPessoaNotPracaNamed();

}
