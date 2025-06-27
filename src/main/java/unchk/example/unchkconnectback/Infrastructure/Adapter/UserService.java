package unchk.example.unchkconnectback.Infrastructure.Adapter;

import org.springframework.stereotype.Service;
import unchk.example.unchkconnectback.Domain.Entity.DomainUser;
import unchk.example.unchkconnectback.Domain.Gateway.UserRepositoryInterface;
import unchk.example.unchkconnectback.Domain.Port.UserServiceInterface;

import java.util.List;

@Service
public class UserService implements UserServiceInterface {
    private final UserRepositoryInterface repository;

    public UserService(UserRepositoryInterface repository) {
        this.repository = repository;
    }

    @Override
    public DomainUser getById(Long id) {
        return repository.getById(id);
    }

    @Override
    public List<DomainUser> getAll() {
        return repository.getAll();
    }

    @Override
    public DomainUser save(DomainUser user) {
        return repository.save(user);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }
}
