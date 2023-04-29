package sn.kcm.dev.revision_jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
//@DiscriminatorValue("ENS") ---> Cas d'une seule table dans la bdd avec une colonne qui fait la distinguo
public class Enseignant extends Personne{
    private String matiere;
}
