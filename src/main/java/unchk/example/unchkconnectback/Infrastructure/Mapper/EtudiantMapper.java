package unchk.example.unchkconnectback.Infrastructure.Mapper;

import org.mapstruct.Mapper;
import unchk.example.unchkconnectback.Domain.Entity.DomainEtudiant;
import unchk.example.unchkconnectback.Domain.Response.EtudiantResponse;
import unchk.example.unchkconnectback.Infrastructure.Models.Etudiant;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class, FormationMapper.class})

public interface EtudiantMapper {
    Etudiant toJpa(DomainEtudiant domainEtudiant);
    DomainEtudiant toDomain(Etudiant etudiant);
    List<Etudiant> toJpaList(List<DomainEtudiant> domainEtudiants);
    List<DomainEtudiant> toDomainList(List<Etudiant> etudiants);
    EtudiantResponse toResponse(DomainEtudiant domain);
    List<EtudiantResponse> toResponseList(List<DomainEtudiant> domainList);
}
