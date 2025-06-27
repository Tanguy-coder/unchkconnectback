package unchk.example.unchkconnectback.Infrastructure.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unchk.example.unchkconnectback.Infrastructure.Models.Personnel;

public interface PersonnelJPaInterface extends JpaRepository<Personnel, Long> {
}
