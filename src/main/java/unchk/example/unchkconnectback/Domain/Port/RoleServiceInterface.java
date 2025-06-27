package unchk.example.unchkconnectback.Domain.Port;

import unchk.example.unchkconnectback.Domain.Entity.DomainRole;

import java.util.List;

public interface RoleServiceInterface {
    List<DomainRole> findAll();
    DomainRole getById(Long id);
    DomainRole save(DomainRole role);
    void delete(Long id);
}
