package unchk.example.unchkconnectback.Domain.UseCase.Formation;


import unchk.example.unchkconnectback.Domain.Entity.DomainFormation;
import unchk.example.unchkconnectback.Domain.Port.FormationServiceInterface;

public class CreateFormationUseCase implements CreateFormationUseCaseInterface {
    private final FormationServiceInterface service;

    public CreateFormationUseCase(FormationServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomainFormation execute(DomainFormation formation) {
        return service.save(formation);
    }
}
