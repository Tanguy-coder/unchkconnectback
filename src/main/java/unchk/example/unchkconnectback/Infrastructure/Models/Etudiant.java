package unchk.example.unchkconnectback.Infrastructure.Models;

import jakarta.persistence.*;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ine;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "formation_id")
    private Formation formation;
    private String annee_debut;
    private String annee_fin;
    private String diplomes;
    private String autre_formations;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    public Etudiant() {
        super();
    }

    public Etudiant(String ine, Formation formation, String annee_debut, String annee_fin, String diplomes, String autre_formations, User user) {
        this.ine = ine;
        this.formation = formation;
        this.annee_debut = annee_debut;
        this.annee_fin = annee_fin;
        this.diplomes = diplomes;
        this.autre_formations = autre_formations;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIne() {
        return ine;
    }

    public void setIne(String ine) {
        this.ine = ine;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public String getAnnee_debut() {
        return annee_debut;
    }

    public void setAnnee_debut(String annee_debut) {
        this.annee_debut = annee_debut;
    }

    public String getAnnee_fin() {
        return annee_fin;
    }

    public void setAnnee_fin(String annee_fin) {
        this.annee_fin = annee_fin;
    }

    public String getDiplomes() {
        return diplomes;
    }

    public void setDiplomes(String diplomes) {
        this.diplomes = diplomes;
    }

    public String getAutre_formations() {
        return autre_formations;
    }

    public void setAutre_formations(String autre_formations) {
        this.autre_formations = autre_formations;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
