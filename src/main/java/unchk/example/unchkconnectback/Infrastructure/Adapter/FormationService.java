package unchk.example.unchkconnectback.Infrastructure.Adapter;

import org.springframework.stereotype.Service;
import unchk.example.unchkconnectback.Domain.Entity.DomainFormation;
import unchk.example.unchkconnectback.Domain.Gateway.FormationRepositoryInterface;
import unchk.example.unchkconnectback.Domain.Port.FormationServiceInterface;

import java.util.List;

@Service
public class FormationService implements FormationServiceInterface {
    private  final FormationRepositoryInterface repository;

    public FormationService(FormationRepositoryInterface repository) {
        this.repository = repository;
    }

    @Override
    public List<DomainFormation> findAll() {
        return repository.findAll();
    }

    @Override
    public DomainFormation findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public DomainFormation save(DomainFormation formation) {
        return repository.save(formation);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }
}
