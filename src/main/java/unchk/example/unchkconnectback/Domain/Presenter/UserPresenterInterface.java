package unchk.example.unchkconnectback.Domain.Presenter;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;
import unchk.example.unchkconnectback.Domain.Response.UserResponse;

import java.util.List;

public interface UserPresenterInterface {
    public UserResponse presente(DomainUser domainUser);

    public List<UserResponse> presentList(List<DomainUser> domainUsers);
}
