package unchk.example.unchkconnectback.Domain.Entity;

public class DomainRole {
    private Long id;
    private String nom;

    public DomainRole() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
