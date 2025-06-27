package unchk.example.unchkconnectback.Domain.Response;

public class EtudiantResponse {
    private Long id;
    private String ine;
    private String anneeDebut;
    private String anneeFin;
    private String diplomes;
    private String autreFormations;

    private UserResponse user;         // réponse imbriquée
    private String formation;          // nom de la formation par exemple
}
