package sn.kcm.dev.revision_jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) -------> Pour le cas où o veut une seule table dans la bdd
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) -------> Pour le cas où o veut deux tables dans la bdd
@Inheritance(strategy = InheritanceType.JOINED) //-------> Pour le cas où o veut trois tables dans la bdd
//@DiscriminatorColumn(name = "FONC", length = 4) --> Pour le cas où o veut une seule table dans la bdd avec la colonne discrimnative
public abstract class Personne {
    @Id @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String name;
}
