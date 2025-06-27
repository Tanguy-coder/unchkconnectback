package unchk.example.unchkconnectback.Infrastructure.Presenter;

import unchk.example.unchkconnectback.Domain.Entity.DomainRole;
import unchk.example.unchkconnectback.Domain.Presenter.RolePresenterInterface;
import unchk.example.unchkconnectback.Domain.Response.RoleResponse;
import unchk.example.unchkconnectback.Infrastructure.Mapper.RoleMapper;

import java.util.List;

public class RolePresenter implements RolePresenterInterface {
    private final RoleMapper mapper;

    public RolePresenter(RoleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public RoleResponse presente(DomainRole domainRole) {
        return mapper.toResponse(domainRole);
    }

    @Override
    public List<RoleResponse> presentList(List<DomainRole> domainRoles) {
        return mapper.toResponseList(domainRoles);
    }
}
