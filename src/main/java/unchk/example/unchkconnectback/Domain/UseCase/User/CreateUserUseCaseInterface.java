package unchk.example.unchkconnectback.Domain.UseCase.User;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;

public interface CreateUserUseCaseInterface {
    public DomainUser execute(DomainUser user);
}
