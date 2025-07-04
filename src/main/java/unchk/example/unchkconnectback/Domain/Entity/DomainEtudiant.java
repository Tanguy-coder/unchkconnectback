package unchk.example.unchkconnectback.Domain.Entity;

public class DomainEtudiant {
    private Long id;
    private String ine;
    private String annee_debut;
    private String annee_fin;
    private String diplomes;
    private String autre_formations;
    private DomainUser user;
    private DomainFormation formation;

    public DomainEtudiant() {
        super();
    }

    public String getIne() {
        return ine;
    }

    public void setIne(String ine) {
        this.ine = ine;
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

    public DomainUser getUser() {
        return user;
    }

    public void setUser(DomainUser user) {
        this.user = user;
    }

    public DomainFormation getFormation() {
        return formation;
    }

    public void setFormation(DomainFormation formation) {
        this.formation = formation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
