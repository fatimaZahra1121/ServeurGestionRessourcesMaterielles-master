package ma.fstf.ServeurGestionRessourcesMaterielles.Repositories;

import ma.fstf.ServeurGestionRessourcesMaterielles.Models.Materiel;
import ma.fstf.ServeurGestionRessourcesMaterielles.Models.Materiel_Proposition;
import ma.fstf.ServeurGestionRessourcesMaterielles.Models.Proposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterielPropositionRepository extends JpaRepository<Materiel_Proposition,Integer> {

    List<Materiel_Proposition> findMateriel_PropositionByProposition(Proposition pro);
    /*******************************************/
    @Query(nativeQuery = true,value = "" +
            "select m.* from materiel_proposition m, proposition p" +
            " where m.materiel_id= :id and m.proposition_id=p.id and p.status = 'accepte'")
    Materiel_Proposition getMaterialProposition(@Param("id") Integer id);
    //    Materiel findMaterielByid(Integer id);
    Materiel_Proposition findMateriel_PropositionByMateriel(Materiel m);
    Materiel_Proposition findMateriel_PropositionByMaterielId(Integer id);

    List<Materiel_Proposition> findByProposition(Proposition prop);

    Materiel_Proposition save(Materiel_Proposition MatProp);

    List<Materiel_Proposition> findAllByMateriel(Materiel materiel);

}
