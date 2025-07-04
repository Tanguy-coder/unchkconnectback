package unchk.example.unchkconnectback.Domain.UseCase.Authentication;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;

public interface LoginUseCaseInterface {
    String execute(String email, String password);
    DomainUser findByEmail(String email);
}
