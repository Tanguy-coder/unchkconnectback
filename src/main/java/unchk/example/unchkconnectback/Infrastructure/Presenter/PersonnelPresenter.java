package unchk.example.unchkconnectback.Infrastructure.Presenter;

import unchk.example.unchkconnectback.Domain.Entity.DomainPersonnel;
import unchk.example.unchkconnectback.Domain.Presenter.PersonnelPresenterInterface;
import unchk.example.unchkconnectback.Domain.Response.PersonnelResponse;
import unchk.example.unchkconnectback.Infrastructure.Mapper.PersonnelMapper;

import java.util.List;

public class PersonnelPresenter implements PersonnelPresenterInterface {
    private final PersonnelMapper mapper;

    public PersonnelPresenter(PersonnelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public PersonnelResponse presente(DomainPersonnel domainPersonnel) {
        return mapper.toResponse(domainPersonnel);
    }

    @Override
    public List<PersonnelResponse> presentList(List<DomainPersonnel> domainRoles) {
        return mapper.toResponseList(domainRoles);
    }
}
