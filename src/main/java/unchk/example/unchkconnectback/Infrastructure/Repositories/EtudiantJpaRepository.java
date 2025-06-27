package unchk.example.unchkconnectback.Infrastructure.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unchk.example.unchkconnectback.Infrastructure.Models.Etudiant;

public interface EtudiantJpaRepository extends JpaRepository<Etudiant,Long> {
}
