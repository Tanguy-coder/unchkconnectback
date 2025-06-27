package unchk.example.unchkconnectback.Domain.UseCase.Etudiants;

import unchk.example.unchkconnectback.Domain.Entity.DomainEtudiant;
import unchk.example.unchkconnectback.Domain.Port.EtudiantServiceInterface;

public class UpdateEtudiantUseCase implements UpdateEtudiantUseCaseInterface{
    public final EtudiantServiceInterface service;

    public UpdateEtudiantUseCase(EtudiantServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomainEtudiant execute(DomainEtudiant etudiant) {
        return service.save(etudiant);
    }
}
