package unchk.example.unchkconnectback.Infrastructure.Mapper;

import org.mapstruct.Mapper;
import unchk.example.unchkconnectback.Domain.Entity.DomainFormation;
import unchk.example.unchkconnectback.Domain.Response.FormationResponse;
import unchk.example.unchkconnectback.Infrastructure.Models.Formation;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FormationMapper {
    Formation toJpa(DomainFormation domain);
    DomainFormation toDomain(Formation jpa);
    List<Formation> toJpaList(List<DomainFormation> domainList);
    List<DomainFormation> toDomainList(List<Formation> jpaList);
    FormationResponse toResponse(DomainFormation domain);
    List<FormationResponse> toResponseList(List<DomainFormation>formationList);
}
