package unchk.example.unchkconnectback.Domain.UseCase.User;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;
import unchk.example.unchkconnectback.Domain.Port.UserServiceInterface;

public class CreateUserUseCase implements CreateUserUseCaseInterface{
    private final UserServiceInterface service;

    public CreateUserUseCase(UserServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomainUser execute(DomainUser user) {
        return service.save(user);
    }
}
