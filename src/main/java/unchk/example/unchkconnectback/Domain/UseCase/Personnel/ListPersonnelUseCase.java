package unchk.example.unchkconnectback.Domain.UseCase.Personnel;

import unchk.example.unchkconnectback.Domain.Entity.DomainPersonnel;
import unchk.example.unchkconnectback.Domain.Port.PersonnelServiceInterface;

import java.util.List;

public class ListPersonnelUseCase implements ListPersonnelUseCaseInterface{
    private final PersonnelServiceInterface service;

    public ListPersonnelUseCase(PersonnelServiceInterface service) {
        this.service = service;
    }

    @Override
    public List<DomainPersonnel> execute() {
        return service.getAll();
    }
}
