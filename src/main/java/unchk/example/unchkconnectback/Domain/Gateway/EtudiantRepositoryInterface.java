package unchk.example.unchkconnectback.Domain.Gateway;

import unchk.example.unchkconnectback.Domain.Entity.DomainEtudiant;

import java.util.List;

public interface EtudiantRepositoryInterface {
    List<DomainEtudiant> getAll();
    DomainEtudiant save(DomainEtudiant etudiant);
    DomainEtudiant getById(Long id);
    void delete(Long id);
}
