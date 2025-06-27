package unchk.example.unchkconnectback.Domain.UseCase.Role;

import unchk.example.unchkconnectback.Domain.Entity.DomainRole;
import unchk.example.unchkconnectback.Domain.Port.RoleServiceInterface;

public class CreateRoleUseCase implements CreateRoleUseCaseInterface{
    private final RoleServiceInterface service;

    public CreateRoleUseCase(RoleServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomainRole execute(DomainRole role) {
        return service.save(role);
    }
}
