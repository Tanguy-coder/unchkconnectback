package unchk.example.unchkconnectback.Domain.Presenter;

import unchk.example.unchkconnectback.Domain.Entity.DomainEtudiant;
import unchk.example.unchkconnectback.Domain.Response.EtudiantResponse;

import java.util.List;

public interface EtudiantPresenterInterface {
    public EtudiantResponse presente(DomainEtudiant etudiant);

    public List<EtudiantResponse> presentList(List<DomainEtudiant> domainEtudiantList);
}
