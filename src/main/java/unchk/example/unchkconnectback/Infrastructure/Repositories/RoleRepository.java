package unchk.example.unchkconnectback.Infrastructure.Repositories;

import org.springframework.stereotype.Repository;
import unchk.example.unchkconnectback.Domain.Entity.DomainRole;
import unchk.example.unchkconnectback.Domain.Gateway.RoleRepositoryInterface;
import unchk.example.unchkconnectback.Infrastructure.Mapper.RoleMapper;
import unchk.example.unchkconnectback.Infrastructure.Models.Role;

import java.util.List;

@Repository
public class RoleRepository implements RoleRepositoryInterface {
    private final RoleJpaRepository repository;
    private final RoleMapper mapper;

    public RoleRepository(RoleJpaRepository repository, RoleMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<DomainRole> findAll() {
        List<Role> roles = repository.findAll();
        return mapper.toDomainList(roles);
    }

    public DomainRole getById(Long id) {
        return repository.findById(id)
                .map(mapper::toDomain)
                .orElseThrow(() -> new RuntimeException("Rôle non trouvé avec l'id: " + id));
    }

    @Override
    public DomainRole save(DomainRole role) {
        Role jpaRole = repository.save(mapper.toJpa(role));
        return mapper.toDomain(jpaRole);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
