package unchk.example.unchkconnectback.Domain.UseCase.Role;

import unchk.example.unchkconnectback.Domain.Entity.DomainRole;

public interface GetRoleByIdUseCaseInterface {
    public DomainRole execute(Long id);
}
