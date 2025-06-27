package unchk.example.unchkconnectback.Domain.UseCase.Formation;

import unchk.example.unchkconnectback.Domain.Entity.DomainFormation;

public interface GetFormationByIdUseCaseInterface {
    public DomainFormation execute(Long id);
}
