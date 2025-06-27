package unchk.example.unchkconnectback.Domain.Port;

import unchk.example.unchkconnectback.Domain.Entity.DomainPersonnel;

import java.util.List;

public interface PersonnelServiceInterface {
    DomainPersonnel create(DomainPersonnel personnel);
    List<DomainPersonnel> getAll();
    DomainPersonnel getById(Long id);
    void delete(Long id);
}
