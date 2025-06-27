package unchk.example.unchkconnectback.Infrastructure.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unchk.example.unchkconnectback.Infrastructure.Models.Role;

public interface RoleJpaRepository extends JpaRepository<Role,Long> {
}
