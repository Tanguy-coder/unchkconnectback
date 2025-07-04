package unchk.example.unchkconnectback.Domain.Port;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;

public interface AuthServiceInterface {
    String authenticateAndGenerateToken(DomainUser user, String password);
}
