package unchk.example.unchkconnectback.Domain.UseCase.Formation;

import unchk.example.unchkconnectback.Domain.Entity.DomainFormation;
import unchk.example.unchkconnectback.Domain.Port.FormationServiceInterface;

import java.util.List;

public class ListFormationUseCase implements ListFormationUseCseInterface{
    private final FormationServiceInterface service;

    public ListFormationUseCase(FormationServiceInterface service) {
        this.service = service;
    }

    @Override
    public List<DomainFormation> execute() {
        System.out.println("Dans le use case Formation");
        return service.findAll();
    }
}
