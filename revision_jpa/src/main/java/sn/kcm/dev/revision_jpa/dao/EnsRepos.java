package sn.kcm.dev.revision_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.kcm.dev.revision_jpa.entities.Enseignant;
import sn.kcm.dev.revision_jpa.entities.Personne;

public interface EnsRepos extends JpaRepository<Enseignant, Long> {
}
