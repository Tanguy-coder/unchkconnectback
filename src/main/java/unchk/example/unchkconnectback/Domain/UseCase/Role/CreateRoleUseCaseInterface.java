package unchk.example.unchkconnectback.Domain.UseCase.Role;

import unchk.example.unchkconnectback.Domain.Entity.DomainRole;

public interface CreateRoleUseCaseInterface {
    public DomainRole execute(DomainRole role);
}
