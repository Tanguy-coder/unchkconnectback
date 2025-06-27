package unchk.example.unchkconnectback.Domain.Gateway;

import unchk.example.unchkconnectback.Domain.Entity.DomainPersonnel;

import java.util.List;

public interface PersonnelRepositoryInterface {
    DomainPersonnel create(DomainPersonnel personnel);
    List<DomainPersonnel> getAll();
    DomainPersonnel getById(Long id);
    void delete(Long id);
}
