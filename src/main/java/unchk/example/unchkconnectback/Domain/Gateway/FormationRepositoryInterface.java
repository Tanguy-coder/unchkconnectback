package unchk.example.unchkconnectback.Domain.Gateway;

import unchk.example.unchkconnectback.Domain.Entity.DomainFormation;

import java.util.List;

public interface FormationRepositoryInterface {
    List<DomainFormation> findAll();
    DomainFormation findById(Long id);
    DomainFormation save(DomainFormation formation);
    void delete(Long id);
}
