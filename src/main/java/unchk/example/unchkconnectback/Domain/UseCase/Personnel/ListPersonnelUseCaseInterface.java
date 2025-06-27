package unchk.example.unchkconnectback.Domain.UseCase.Personnel;

import unchk.example.unchkconnectback.Domain.Entity.DomainPersonnel;

import java.util.List;

public interface ListPersonnelUseCaseInterface {
    public List<DomainPersonnel> execute();
}
