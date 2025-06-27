package unchk.example.unchkconnectback.Domain.UseCase.Role;

import unchk.example.unchkconnectback.Domain.Entity.DomainRole;
import unchk.example.unchkconnectback.Domain.Port.RoleServiceInterface;

public class GetRoleByIdUseCase implements GetRoleByIdUseCaseInterface{
    private final RoleServiceInterface service;

    public GetRoleByIdUseCase(RoleServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomainRole execute(Long id) {
        return service.getById(id);
    }
}
