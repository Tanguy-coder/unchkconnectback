package unchk.example.unchkconnectback.Infrastructure.Mapper;

import org.mapstruct.Mapper;
import unchk.example.unchkconnectback.Domain.Entity.DomainRole;
import unchk.example.unchkconnectback.Domain.Response.RoleResponse;
import unchk.example.unchkconnectback.Infrastructure.Models.Role;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    Role toJpa(DomainRole domain);
    DomainRole toDomain(Role jpa);
    RoleResponse toResponse(DomainRole domain);
    List<DomainRole> toDomainList(List<Role> jpaList);
    List<Role> toJpaList(List<DomainRole> domainList);
    List<RoleResponse> toResponseList(List<DomainRole> domainList);
}