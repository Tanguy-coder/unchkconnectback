package unchk.example.unchkconnectback.Domain.UseCase.Personnel;

import unchk.example.unchkconnectback.Domain.Entity.DomainPersonnel;
import unchk.example.unchkconnectback.Domain.Port.PersonnelServiceInterface;

public class GetPersonnelByIdUseCase implements GetPersonnelByIdUseCaseInterface{
    private final PersonnelServiceInterface service;

    public GetPersonnelByIdUseCase(PersonnelServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomainPersonnel execute(Long id) {
        return service.getById(id);
    }
}
