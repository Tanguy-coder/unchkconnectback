package unchk.example.unchkconnectback.Infrastructure.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Insertion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String annee;
    private Integer nbPerseonnes;

    public Insertion(String type, String annee, Integer nbPerseonnes) {
        this.type = type;
        this.annee = annee;
        this.nbPerseonnes = nbPerseonnes;
    }

    public Insertion() {

    }


}
