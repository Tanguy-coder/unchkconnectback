package unchk.example.unchkconnectback.Domain.UseCase.Role;

import unchk.example.unchkconnectback.Domain.Entity.DomainRole;
import unchk.example.unchkconnectback.Domain.Port.RoleServiceInterface;

import java.util.List;

public class ListRoleUseCase implements ListRoleUseCaseInterface{
    private final RoleServiceInterface service;

    public ListRoleUseCase(RoleServiceInterface service) {
        this.service = service;
    }

    @Override
    public List<DomainRole> execute() {
        return service.findAll();
    }
}
