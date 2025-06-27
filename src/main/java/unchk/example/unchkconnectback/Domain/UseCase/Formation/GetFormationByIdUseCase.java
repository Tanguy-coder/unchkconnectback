package unchk.example.unchkconnectback.Domain.UseCase.Formation;

import unchk.example.unchkconnectback.Domain.Entity.DomainFormation;
import unchk.example.unchkconnectback.Domain.Port.FormationServiceInterface;

public class GetFormationByIdUseCase implements GetFormationByIdUseCaseInterface{
    private final FormationServiceInterface service;

    public GetFormationByIdUseCase(FormationServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomainFormation execute(Long id) {
        return service.findById(id);
    }
}
