package unchk.example.unchkconnectback.Infrastructure.Repositories;

import org.springframework.stereotype.Repository;
import unchk.example.unchkconnectback.Domain.Entity.DomainEtudiant;
import unchk.example.unchkconnectback.Domain.Gateway.EtudiantRepositoryInterface;
import unchk.example.unchkconnectback.Infrastructure.Mapper.EtudiantMapper;
import unchk.example.unchkconnectback.Infrastructure.Models.Etudiant;

import java.util.List;

@Repository
public class EtudiantRepository implements EtudiantRepositoryInterface {
    private final EtudiantMapper mapper;
    private final EtudiantJpaRepository repository;

    public EtudiantRepository(EtudiantMapper mapper, EtudiantJpaRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public List<DomainEtudiant> getAll() {

        List<Etudiant> etudiants = repository.findAll();
        return mapper.toDomainList(etudiants);
    }

    @Override
    public DomainEtudiant save(DomainEtudiant domainEtudiant) {
        Etudiant etudiant = repository.save(mapper.toJpa(domainEtudiant));
        return mapper.toDomain(etudiant);
    }

    @Override
    public DomainEtudiant getById(Long id) {
        return repository.findById(id)
                .map(mapper::toDomain)
                .orElseThrow(() -> new RuntimeException("Etudiant non trouvé avec l'id: " + id));
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}
