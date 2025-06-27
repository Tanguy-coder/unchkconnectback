package unchk.example.unchkconnectback.Domain.Port;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;

import java.util.List;

public interface UserServiceInterface {
    DomainUser getById(Long id);
    List<DomainUser> getAll();
    DomainUser save(DomainUser user);
    void delete(Long id);
}
