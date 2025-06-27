package unchk.example.unchkconnectback.Infrastructure.Mapper;

import org.mapstruct.Mapper;
import unchk.example.unchkconnectback.Domain.Entity.DomainPersonnel;
import unchk.example.unchkconnectback.Domain.Response.PersonnelResponse;
import unchk.example.unchkconnectback.Infrastructure.Models.Personnel;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonnelMapper {
    DomainPersonnel toDomain(Personnel personnel);
    Personnel toJpa(DomainPersonnel domain);
    List<DomainPersonnel> toDomainList(List<Personnel> personnels);
    List<Personnel> toJpaList(List<DomainPersonnel> personnels);
    PersonnelResponse toResponse(DomainPersonnel personnel);
    List<PersonnelResponse> toResponseList(List<DomainPersonnel> personnels);
}
