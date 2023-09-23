/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Beans;

import DTO.MembroDTO;
import Entidades.Grupo;
import java.time.LocalDate;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author welin
 */
@Local
public interface GrupoBeanLocal {
    List<Grupo> fetchAllInactives();

    List<Object[]> fetchLeadersAndNames();

    List<String> fetchMemberNames(String nomeGrupo);

    List<Grupo> fetchLeadBy(String nomeLider);

    List<Object[]> fetchParticipationFrom(String nomeMembro);

    List<Grupo> fetchLike(String nomeGrupo);

    List<Object[]> fetchMembersCount();

    List<Object[]> fetchHasMoreThanMembers(Long total);

    List<String> fetchMembersNamesHasJoinAfter(Long grupoId, LocalDate dataInicio);

    List<MembroDTO> fetchMembersHasJoinAfter(LocalDate dataInicio);

    List<MembroDTO> fetchMembersHasJoinAfter(LocalDate dataInicio, Long grupoId);

    List<MembroDTO> fetchMembersHasJoinAfter(LocalDate dataInicio, List<Long> grupoIds);

    List<String[]> fetchMembersWithoutEndDate();

    List<String[]> fetchAll();
}
