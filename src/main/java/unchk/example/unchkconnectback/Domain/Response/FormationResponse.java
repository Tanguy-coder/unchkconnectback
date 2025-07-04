package unchk.example.unchkconnectback.Domain.Response;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class FormationResponse {
    private Long id;
    private String nom;
    private Date dateDebut;
    private Date dateFin;
    private String type;
    private String niveau;
    private String financement;
    private Float montant;
    private Integer nbParticipants;

    public FormationResponse() {
    }
}
