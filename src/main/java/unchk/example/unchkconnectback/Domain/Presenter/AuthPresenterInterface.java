package unchk.example.unchkconnectback.Domain.Presenter;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;
import unchk.example.unchkconnectback.Domain.Response.AuthResponse;

public interface AuthPresenterInterface {
    AuthResponse present(DomainUser user);
    AuthResponse presentWithToken(DomainUser user, String token);
}
