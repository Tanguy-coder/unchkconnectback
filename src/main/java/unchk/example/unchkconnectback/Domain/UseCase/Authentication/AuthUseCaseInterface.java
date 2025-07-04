package unchk.example.unchkconnectback.Domain.UseCase.Authentication;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;

public interface AuthUseCaseInterface {
    DomainUser register(DomainUser user);
    String login(String email, String password);
}
