package unchk.example.unchkconnectback.Domain.UseCase.Role;

import unchk.example.unchkconnectback.Domain.Entity.DomainFormation;

public interface GetFormationByIdInterface {
    public DomainFormation execute(Long id);
}
