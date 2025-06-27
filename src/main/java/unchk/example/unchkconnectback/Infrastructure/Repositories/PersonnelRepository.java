package unchk.example.unchkconnectback.Infrastructure.Repositories;

import org.springframework.stereotype.Repository;
import unchk.example.unchkconnectback.Domain.Entity.DomainPersonnel;
import unchk.example.unchkconnectback.Domain.Gateway.PersonnelRepositoryInterface;
import unchk.example.unchkconnectback.Infrastructure.Mapper.PersonnelMapper;
import unchk.example.unchkconnectback.Infrastructure.Models.Personnel;

import java.util.List;

@Repository
public class PersonnelRepository implements PersonnelRepositoryInterface {
    private final PersonnelMapper mapper;
    private final PersonnelJPaInterface repository;

    public PersonnelRepository(PersonnelMapper mapper, PersonnelJPaInterface repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public DomainPersonnel create(DomainPersonnel personnel) {
        Personnel jpa = repository.save(mapper.toJpa(personnel));
        return mapper.toDomain(jpa);
    }

    @Override
    public List<DomainPersonnel> getAll() {
        List<Personnel> jpa = repository.findAll();
        return mapper.toDomainList(jpa);
    }

    @Override
    public DomainPersonnel getById(Long id) {
        return repository.findById(id)
                .map(mapper::toDomain)
                .orElseThrow(() -> new RuntimeException("Rôle non trouvé avec l'id: " + id));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
