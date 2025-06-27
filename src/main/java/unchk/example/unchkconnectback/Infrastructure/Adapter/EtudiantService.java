package unchk.example.unchkconnectback.Infrastructure.Adapter;

import org.springframework.stereotype.Service;
import unchk.example.unchkconnectback.Domain.Entity.DomainEtudiant;
import unchk.example.unchkconnectback.Domain.Gateway.EtudiantRepositoryInterface;
import unchk.example.unchkconnectback.Domain.Port.EtudiantServiceInterface;

import java.util.List;

@Service
public class EtudiantService implements EtudiantServiceInterface {
    private final EtudiantRepositoryInterface repository;

    public EtudiantService(EtudiantRepositoryInterface repository) {
        this.repository = repository;
    }

    @Override
    public List<DomainEtudiant> getAll() {
        return repository.getAll();
    }

    @Override
    public DomainEtudiant save(DomainEtudiant etudiant) {
        return this.repository.save(etudiant);
    }

    @Override
    public DomainEtudiant getById(Long id) {
        return repository.getById(id);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }
}
