package unchk.example.unchkconnectback.Domain.UseCase.Etudiants;

import unchk.example.unchkconnectback.Domain.Entity.DomainEtudiant;
import unchk.example.unchkconnectback.Domain.Port.EtudiantServiceInterface;

public class GetEtudiantUseCase implements GetEtudiantUseCaseInterface{
    private final EtudiantServiceInterface service;

    public GetEtudiantUseCase(EtudiantServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomainEtudiant execute(Long id) {
        return service.getById(id);
    }
}
