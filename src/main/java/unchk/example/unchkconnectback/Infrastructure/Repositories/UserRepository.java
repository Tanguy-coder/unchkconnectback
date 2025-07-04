package unchk.example.unchkconnectback.Infrastructure.Repositories;

import org.springframework.stereotype.Repository;
import unchk.example.unchkconnectback.Domain.Entity.DomainUser;
import unchk.example.unchkconnectback.Domain.Gateway.UserRepositoryInterface;
import unchk.example.unchkconnectback.Infrastructure.Mapper.UserMapper;
import unchk.example.unchkconnectback.Infrastructure.Models.User;

import java.util.List;

@Repository
public class UserRepository implements UserRepositoryInterface {
    private final UserJpaRepository repository;
    private final UserMapper mapper;

    public UserRepository(UserJpaRepository repository, UserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public DomainUser getById(Long id) {
        return repository.findById(id)
                .map(mapper::toDomain)
                .orElseThrow(() -> new RuntimeException("Etudiant non trouvé avec l'id: " + id));
    }

    @Override
    public List<DomainUser> getAll() {
        List<User> users = repository.findAll();
        return mapper.toDomainList(users);
    }

    @Override
    public DomainUser findByEmail(String email) {
        return repository.findByEmail(email)
                .map(mapper::toDomain)
                .orElseThrow(()->new RuntimeException("User non trouvé avec l'id: " + email));
    }


    @Override
    public DomainUser save(DomainUser user) {
        User jpaUser = repository.save(mapper.toJpa(user));
        return mapper.toDomain(jpaUser);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
