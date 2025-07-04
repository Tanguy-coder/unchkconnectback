package unchk.example.unchkconnectback.Infrastructure.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private String contact;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private Role role;

    public User() {
        super();
    }

    public User(String nom, String prenom, String email, String password, String contact, Role role) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.contact = contact;
        this.role = role;
    }

}
