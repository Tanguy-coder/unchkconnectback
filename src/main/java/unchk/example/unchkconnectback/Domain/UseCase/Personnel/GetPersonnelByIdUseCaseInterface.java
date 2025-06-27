package unchk.example.unchkconnectback.Domain.UseCase.Personnel;

import unchk.example.unchkconnectback.Domain.Entity.DomainPersonnel;

public interface GetPersonnelByIdUseCaseInterface {
    public DomainPersonnel execute(Long id);
}
