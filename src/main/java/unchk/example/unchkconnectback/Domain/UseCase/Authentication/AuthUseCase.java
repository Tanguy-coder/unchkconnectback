package unchk.example.unchkconnectback.Domain.UseCase.Authentication;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;
import unchk.example.unchkconnectback.Domain.Port.AuthServiceInterface;

public class AuthUseCase implements AuthUseCaseInterface{
    private final AuthServiceInterface service;

    public AuthUseCase(AuthServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomainUser register(DomainUser user) {
        return this.service.register(user);
    }

    @Override
    public String login(String email, String password) {
        return this.service.login(email,password);
    }
}
