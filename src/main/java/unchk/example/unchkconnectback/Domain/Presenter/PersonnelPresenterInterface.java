package unchk.example.unchkconnectback.Domain.Presenter;



import unchk.example.unchkconnectback.Domain.Entity.DomainPersonnel;
import unchk.example.unchkconnectback.Domain.Response.PersonnelResponse;

import java.util.List;

public interface PersonnelPresenterInterface {
    public PersonnelResponse presente(DomainPersonnel domainPersonnel);
    public List<PersonnelResponse> presentList(List<DomainPersonnel> domainRoles);
}
