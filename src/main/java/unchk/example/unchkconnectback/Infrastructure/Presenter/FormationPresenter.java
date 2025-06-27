package unchk.example.unchkconnectback.Infrastructure.Presenter;

import unchk.example.unchkconnectback.Domain.Entity.DomainFormation;
import unchk.example.unchkconnectback.Domain.Presenter.FormationPresenterInterface;
import unchk.example.unchkconnectback.Domain.Response.FormationResponse;
import unchk.example.unchkconnectback.Infrastructure.Mapper.FormationMapper;

import java.util.List;

public class FormationPresenter implements FormationPresenterInterface {
    private final FormationMapper mapper;

    public FormationPresenter(FormationMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public FormationResponse presente(DomainFormation formation) {
        return mapper.toResponse(formation);
    }

    @Override
    public List<FormationResponse> presente(List<DomainFormation> formations) {
        return mapper.toResponseList(formations);
    }
}
