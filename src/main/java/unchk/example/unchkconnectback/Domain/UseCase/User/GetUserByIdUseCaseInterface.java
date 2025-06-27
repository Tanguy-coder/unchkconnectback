package unchk.example.unchkconnectback.Domain.UseCase.User;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;

public interface GetUserByIdUseCaseInterface {
    public DomainUser execute(Long id);
}
