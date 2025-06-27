package unchk.example.unchkconnectback.Domain.UseCase.Etudiants;

import unchk.example.unchkconnectback.Domain.Entity.DomainEtudiant;
import unchk.example.unchkconnectback.Domain.Port.EtudiantServiceInterface;

public class CreateEtudiantUseCase implements CreateEtudiantUseCaseInterface{
    private final EtudiantServiceInterface service;

    public CreateEtudiantUseCase(EtudiantServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomainEtudiant execute(DomainEtudiant etudiant) {
        return this.service.save(etudiant);
    }
}
