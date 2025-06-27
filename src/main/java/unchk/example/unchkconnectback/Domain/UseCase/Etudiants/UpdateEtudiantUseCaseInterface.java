package unchk.example.unchkconnectback.Domain.UseCase.Etudiants;

import unchk.example.unchkconnectback.Domain.Entity.DomainEtudiant;

public interface UpdateEtudiantUseCaseInterface {
    public DomainEtudiant execute(DomainEtudiant etudiant);
}
