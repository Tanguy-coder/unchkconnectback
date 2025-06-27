package unchk.example.unchkconnectback.Domain.UseCase.Formation;

import unchk.example.unchkconnectback.Domain.Entity.DomainFormation;

public interface CreateFormationUseCaseInterface {
    public DomainFormation execute(DomainFormation formation);
}
