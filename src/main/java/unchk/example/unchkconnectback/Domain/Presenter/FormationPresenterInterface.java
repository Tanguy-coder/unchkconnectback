package unchk.example.unchkconnectback.Domain.Presenter;

import unchk.example.unchkconnectback.Domain.Entity.DomainFormation;
import unchk.example.unchkconnectback.Domain.Response.FormationResponse;

import java.util.List;

public interface FormationPresenterInterface {
    public FormationResponse presente(DomainFormation formation);

    public List<FormationResponse> presente(List<DomainFormation> formations);
}
