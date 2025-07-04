package unchk.example.unchkconnectback.Domain.UseCase.Authentication;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;

public interface RegisterUseCaseInterface {
    DomainUser execute(DomainUser user);
}
