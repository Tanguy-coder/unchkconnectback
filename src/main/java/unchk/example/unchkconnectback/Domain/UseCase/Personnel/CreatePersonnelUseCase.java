package unchk.example.unchkconnectback.Domain.UseCase.Personnel;

import unchk.example.unchkconnectback.Domain.Entity.DomainPersonnel;
import unchk.example.unchkconnectback.Domain.Port.PersonnelServiceInterface;

public class CreatePersonnelUseCase implements CreatePersonnelUseCaseInterface{
    private final PersonnelServiceInterface service;

    public CreatePersonnelUseCase(PersonnelServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomainPersonnel execute(DomainPersonnel personnel) {
        return service.create(personnel);
    }
}
