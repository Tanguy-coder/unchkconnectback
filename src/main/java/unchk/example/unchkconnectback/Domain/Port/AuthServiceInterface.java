package unchk.example.unchkconnectback.Domain.Port;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;

public interface AuthServiceInterface {
    DomainUser register(DomainUser user);
    String login(String email, String password);
}
