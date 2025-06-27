package unchk.example.unchkconnectback.Domain.UseCase.Personnel;

import unchk.example.unchkconnectback.Domain.Entity.DomainPersonnel;

public interface CreatePersonnelUseCaseInterface {
    public DomainPersonnel execute(DomainPersonnel personnel);
}
