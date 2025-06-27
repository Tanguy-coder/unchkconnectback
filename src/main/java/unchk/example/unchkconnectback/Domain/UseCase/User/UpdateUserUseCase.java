package unchk.example.unchkconnectback.Domain.UseCase.User;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;
import unchk.example.unchkconnectback.Domain.Port.UserServiceInterface;

public class UpdateUserUseCase implements UpdateUserUseCaseInterface{
    private final UserServiceInterface service;

    public UpdateUserUseCase(UserServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomainUser execute(DomainUser user) {
        return service.save(user);
    }
}
