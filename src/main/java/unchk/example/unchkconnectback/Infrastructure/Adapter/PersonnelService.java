package unchk.example.unchkconnectback.Infrastructure.Adapter;

import org.springframework.stereotype.Service;
import unchk.example.unchkconnectback.Domain.Entity.DomainPersonnel;
import unchk.example.unchkconnectback.Domain.Gateway.PersonnelRepositoryInterface;
import unchk.example.unchkconnectback.Domain.Port.PersonnelServiceInterface;

import java.util.List;

@Service
public class PersonnelService implements PersonnelServiceInterface {
    private final PersonnelRepositoryInterface repository;

    public PersonnelService(PersonnelRepositoryInterface repository) {
        this.repository = repository;
    }

    @Override
    public DomainPersonnel create(DomainPersonnel personnel) {
        return repository.create(personnel);
    }

    @Override
    public List<DomainPersonnel> getAll() {
        return repository.getAll();
    }

    @Override
    public DomainPersonnel getById(Long id) {
        return repository.getById(id);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }
}
