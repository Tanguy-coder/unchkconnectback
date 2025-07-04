package unchk.example.unchkconnectback.Domain.Response;

import unchk.example.unchkconnectback.Infrastructure.Models.Formation;

public class EtudiantResponse {
    private Long id;
    private String ine;
    private String anneeDebut;
    private String anneeFin;
    private String diplomes;
    private String autreFormations;

    private UserResponse user;
    private Formation formation;

    public EtudiantResponse() {
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

    public String getAnneeDebut() {
        return anneeDebut;
    }

    public void setAnneeDebut(String anneeDebut) {
        this.anneeDebut = anneeDebut;
    }

    public String getAnneeFin() {
        return anneeFin;
    }

    public void setAnneeFin(String anneeFin) {
        this.anneeFin = anneeFin;
    }

    public String getDiplomes() {
        return diplomes;
    }

    public void setDiplomes(String diplomes) {
        this.diplomes = diplomes;
    }

    public String getAutreFormations() {
        return autreFormations;
    }

    public void setAutreFormations(String autreFormations) {
        this.autreFormations = autreFormations;
    }

    public UserResponse getUser() {
        return user;
    }

    public void setUser(UserResponse user) {
        this.user = user;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }
}
