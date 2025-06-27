package unchk.example.unchkconnectback.Infrastructure.Adapter;

import org.springframework.stereotype.Service;
import unchk.example.unchkconnectback.Domain.Entity.DomainRole;
import unchk.example.unchkconnectback.Domain.Gateway.RoleRepositoryInterface;
import unchk.example.unchkconnectback.Domain.Port.RoleServiceInterface;

import java.util.List;

@Service
public class RoleService implements RoleServiceInterface {
    private  final RoleRepositoryInterface repository;

    public RoleService(RoleRepositoryInterface repository) {
        this.repository = repository;
    }

    @Override
    public List<DomainRole> findAll() {
        return repository.findAll();
    }

    @Override
    public DomainRole getById(Long id) {
        return repository.getById(id);
    }

    @Override
    public DomainRole save(DomainRole role) {
        return repository.save(role);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }
}
