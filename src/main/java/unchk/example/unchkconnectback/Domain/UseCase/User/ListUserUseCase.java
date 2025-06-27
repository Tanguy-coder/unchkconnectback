package unchk.example.unchkconnectback.Domain.UseCase.User;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;
import unchk.example.unchkconnectback.Domain.Port.UserServiceInterface;

import java.util.List;

public class ListUserUseCase implements ListUserUseCaseInterface{
    private final UserServiceInterface service;

    public ListUserUseCase(UserServiceInterface service) {
        this.service = service;
    }

    @Override
    public List<DomainUser> execute() {
        return service.getAll();
    }
}
