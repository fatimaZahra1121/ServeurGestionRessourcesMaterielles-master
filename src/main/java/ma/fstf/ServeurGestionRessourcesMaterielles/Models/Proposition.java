package ma.fstf.ServeurGestionRessourcesMaterielles.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Proposition {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    @Enumerated(EnumType.STRING)
    private StatusPropo status;
    @ManyToOne
    @JoinColumn(name = "fournisseur_id")
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private Fournisseur fournisseur;
}

