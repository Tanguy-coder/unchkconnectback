package unchk.example.unchkconnectback.Domain.Gateway;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;

import java.util.List;

public interface UserRepositoryInterface {
    DomainUser getById(Long id);
    List<DomainUser> getAll();
    DomainUser save(DomainUser user);
    void delete(Long id);
}
