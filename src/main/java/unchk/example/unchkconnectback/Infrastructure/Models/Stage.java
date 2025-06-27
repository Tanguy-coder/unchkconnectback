package unchk.example.unchkconnectback.Infrastructure.Models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "etudiant_id")
    private Etudiant etudiant;
    private String bilan;
    private String entreprise;
    private Date date_debut;
    private Date date_fin;

    public Stage() {
        super();
    }

    public Stage(Etudiant etudiant, String bilan, String entreprise, Date date_debut, Date date_fin) {
        this.etudiant = etudiant;
        this.bilan = bilan;
        this.entreprise = entreprise;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public String getBilan() {
        return bilan;
    }

    public void setBilan(String bilan) {
        this.bilan = bilan;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }
}
