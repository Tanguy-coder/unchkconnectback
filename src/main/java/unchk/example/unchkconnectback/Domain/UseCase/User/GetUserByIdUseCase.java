package unchk.example.unchkconnectback.Domain.UseCase.User;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;
import unchk.example.unchkconnectback.Domain.Port.UserServiceInterface;

public class GetUserByIdUseCase implements GetUserByIdUseCaseInterface{
    private final UserServiceInterface service;

    public GetUserByIdUseCase(UserServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomainUser execute(Long id) {
        return service.getById(id);
    }
}
