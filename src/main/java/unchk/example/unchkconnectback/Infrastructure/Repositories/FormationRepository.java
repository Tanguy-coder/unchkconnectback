package unchk.example.unchkconnectback.Infrastructure.Repositories;

import org.springframework.stereotype.Repository;
import unchk.example.unchkconnectback.Domain.Entity.DomainFormation;
import unchk.example.unchkconnectback.Domain.Gateway.FormationRepositoryInterface;
import unchk.example.unchkconnectback.Infrastructure.Mapper.FormationMapper;
import unchk.example.unchkconnectback.Infrastructure.Models.Formation;

import java.util.List;

@Repository
public class FormationRepository implements FormationRepositoryInterface {
    private final FormationJpaRepository repository;
    private  final FormationMapper mapper;

    public FormationRepository(FormationJpaRepository repository, FormationMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<DomainFormation> findAll() {
        List<Formation> formations = repository.findAll();
        return mapper.toDomainList(formations);
    }

    @Override
    public DomainFormation findById(Long id) {
        return repository.findById(id)
                .map(mapper::toDomain)
                .orElseThrow(() -> new RuntimeException("Rôle non trouvé avec l'id: " + id));
    }

    @Override
    public DomainFormation save(DomainFormation formation) {
        Formation jpaFormation = repository.save(mapper.toJpa(formation));
        return mapper.toDomain(jpaFormation);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
