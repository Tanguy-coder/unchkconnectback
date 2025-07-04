package unchk.example.unchkconnectback.Infrastructure.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import unchk.example.unchkconnectback.Domain.Entity.DomainFormation;
import unchk.example.unchkconnectback.Domain.Response.FormationResponse;
import unchk.example.unchkconnectback.Infrastructure.Models.Formation;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FormationMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "nom", target = "nom")
    @Mapping(source = "dateDebut", target = "dateDebut")
    @Mapping(source = "dateFin", target = "dateFin")
    @Mapping(source = "type", target = "type")
    @Mapping(source = "niveau", target = "niveau")
    @Mapping(source = "financement", target = "financement")
    @Mapping(source = "montant", target = "montant")
    @Mapping(source = "nbParticipants", target = "nbParticipants")
    Formation toJpa(DomainFormation domain);
    DomainFormation toDomain(Formation jpa);
    List<Formation> toJpaList(List<DomainFormation> domainList);
    List<DomainFormation> toDomainList(List<Formation> jpaList);
    FormationResponse toResponse(DomainFormation domain);
    List<FormationResponse> toResponseList(List<DomainFormation>formationList);
}
