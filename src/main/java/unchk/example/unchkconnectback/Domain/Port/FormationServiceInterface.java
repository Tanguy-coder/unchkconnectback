package unchk.example.unchkconnectback.Domain.Port;

import unchk.example.unchkconnectback.Domain.Entity.DomainFormation;

import java.util.List;

public interface FormationServiceInterface {
    List<DomainFormation> findAll();
    DomainFormation findById(Long id);
    DomainFormation save(DomainFormation formation);
    void delete(Long id);
}
