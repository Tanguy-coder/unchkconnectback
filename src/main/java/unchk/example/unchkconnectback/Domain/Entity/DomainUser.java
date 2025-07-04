package unchk.example.unchkconnectback.Domain.Entity;

public class DomainUser {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private String contact;
    private DomainRole role;

    public DomainUser() {
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public DomainRole getRole() {
        return role;
    }

    public void setRole(DomainRole role) {
        this.role = role;
    }
}
