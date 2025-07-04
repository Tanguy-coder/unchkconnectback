package unchk.example.unchkconnectback.Domain.Response;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;

public class AuthResponse {
    private DomainUser user;
    private String token;

    public AuthResponse(DomainUser user, String token) {
        this.user = user;
        this.token = token;
    }

    public DomainUser getUser() { return user; }
    public void setUser(DomainUser user) { this.user = user; }
    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }
}
