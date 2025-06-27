package unchk.example.unchkconnectback.Infrastructure.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Personnel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prennom;
    private String email;
    private String telephone;
    private String type;
    private String date_naissance;

    public Personnel() {
        super();
    }

    public Personnel(String nom, String prennom, String email, String telephone, String type, String date_naissance) {
        this.nom = nom;
        this.prennom = prennom;
        this.email = email;
        this.telephone = telephone;
        this.type = type;
        this.date_naissance = date_naissance;
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

    public String getPrennom() {
        return prennom;
    }

    public void setPrennom(String prennom) {
        this.prennom = prennom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
    }
}
