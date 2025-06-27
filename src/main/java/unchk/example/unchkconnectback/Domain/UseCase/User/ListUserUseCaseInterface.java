package unchk.example.unchkconnectback.Domain.UseCase.User;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;

import java.util.List;

public interface ListUserUseCaseInterface {
    public List<DomainUser> execute();
}
