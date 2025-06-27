package unchk.example.unchkconnectback.Infrastructure.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unchk.example.unchkconnectback.Infrastructure.Models.User;

public interface UserJpaRepository extends JpaRepository<User,Long> {
}
