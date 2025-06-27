package unchk.example.unchkconnectback.Infrastructure.Presenter;

import unchk.example.unchkconnectback.Domain.Entity.DomainEtudiant;
import unchk.example.unchkconnectback.Domain.Presenter.EtudiantPresenterInterface;
import unchk.example.unchkconnectback.Domain.Response.EtudiantResponse;
import unchk.example.unchkconnectback.Infrastructure.Mapper.EtudiantMapper;

import java.util.List;

public class EtudiantPresenter implements EtudiantPresenterInterface {
    private final EtudiantMapper mapper;

    public EtudiantPresenter(EtudiantMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public EtudiantResponse presente(DomainEtudiant etudiant) {
        return mapper.toResponse(etudiant);
    }

    @Override
    public List<EtudiantResponse> presentList(List<DomainEtudiant> domainEtudiantList) {
        return mapper.toResponseList(domainEtudiantList);
    }
}
