package unchk.example.unchkconnectback.Domain.Presenter;

import unchk.example.unchkconnectback.Domain.Entity.DomainRole;
import unchk.example.unchkconnectback.Domain.Response.RoleResponse;

import java.util.List;

public interface RolePresenterInterface {
    public RoleResponse presente(DomainRole domainRole);
    public List<RoleResponse> presentList(List<DomainRole> domainRoles);
}
