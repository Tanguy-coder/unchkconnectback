package unchk.example.unchkconnectback.Infrastructure.Presenter;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;
import unchk.example.unchkconnectback.Domain.Presenter.AuthPresenterInterface;
import unchk.example.unchkconnectback.Domain.Response.AuthResponse;

public class AuthPresenter implements AuthPresenterInterface {
    @Override
    public AuthResponse present(DomainUser user) {
        return new AuthResponse(user, null);
    }

    @Override
    public AuthResponse presentWithToken(DomainUser user, String token) {
        return new AuthResponse(user, token);
    }
}
