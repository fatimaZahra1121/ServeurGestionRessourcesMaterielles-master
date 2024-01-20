package ma.fstf.ServeurGestionRessourcesMaterielles.DTO.Fournisseur;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FournisseurCnx {

    private String nom_societe;
    private  String pass;

}
