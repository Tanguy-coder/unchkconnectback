package unchk.example.unchkconnectback.Domain.UseCase.Etudiants;

import unchk.example.unchkconnectback.Domain.Entity.DomainEtudiant;

public interface GetEtudiantUseCaseInterface {
    public DomainEtudiant execute(Long id);
}
