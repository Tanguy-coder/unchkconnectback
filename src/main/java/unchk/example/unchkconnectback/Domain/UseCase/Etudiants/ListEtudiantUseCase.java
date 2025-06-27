package unchk.example.unchkconnectback.Domain.UseCase.Etudiants;

import unchk.example.unchkconnectback.Domain.Entity.DomainEtudiant;
import unchk.example.unchkconnectback.Domain.Port.EtudiantServiceInterface;

import java.util.List;

public class ListEtudiantUseCase implements ListEtudiantUseCaseInterface{
    private final EtudiantServiceInterface service;

    public ListEtudiantUseCase(EtudiantServiceInterface service) {
        this.service = service;
    }

    @Override
    public List<DomainEtudiant> execute() {
        return this.service.getAll();
    }
}
