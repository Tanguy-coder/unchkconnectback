package unchk.example.unchkconnectback.Domain.Port;

import unchk.example.unchkconnectback.Domain.Entity.DomainEtudiant;

import java.util.List;

public interface EtudiantServiceInterface {
    List<DomainEtudiant> getAll();
    DomainEtudiant save(DomainEtudiant etudiant);
    DomainEtudiant getById(Long id);
    void delete(Long id);
}
