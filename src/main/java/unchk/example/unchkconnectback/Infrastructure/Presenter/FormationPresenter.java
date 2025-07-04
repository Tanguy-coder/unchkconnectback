package unchk.example.unchkconnectback.Infrastructure.Presenter;

import org.springframework.stereotype.Component;
import unchk.example.unchkconnectback.Domain.Entity.DomainFormation;
import unchk.example.unchkconnectback.Domain.Presenter.FormationPresenterInterface;
import unchk.example.unchkconnectback.Domain.Response.FormationResponse;
import unchk.example.unchkconnectback.Infrastructure.Mapper.FormationMapper;

import java.util.List;
@Component
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
        System.out.println("✅ FormationMapper injecté : " + mapper.getClass().getName());
        return mapper.toResponseList(formations);
    }
}
