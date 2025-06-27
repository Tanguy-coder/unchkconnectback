package unchk.example.unchkconnectback.Domain.Gateway;

import unchk.example.unchkconnectback.Domain.Entity.DomainRole;

import java.util.List;

public interface RoleRepositoryInterface {
    List<DomainRole> findAll();
    DomainRole getById(Long id);
    DomainRole save(DomainRole role);
    void delete(Long id);
}
