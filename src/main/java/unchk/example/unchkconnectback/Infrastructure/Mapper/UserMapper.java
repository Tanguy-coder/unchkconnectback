package unchk.example.unchkconnectback.Infrastructure.Mapper;

import org.mapstruct.Mapper;
import unchk.example.unchkconnectback.Domain.Entity.DomainUser;
import unchk.example.unchkconnectback.Domain.Response.UserResponse;
import unchk.example.unchkconnectback.Infrastructure.Models.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toJpa(DomainUser domain);
    DomainUser toDomain(User jpa);
    List<DomainUser> toDomainList(List<User> jpaList);
    List<User> toJpaList(List<DomainUser> domainList);
    UserResponse toResponse(DomainUser domain);
    List<UserResponse> toResponseList(List<DomainUser> domainList);
}