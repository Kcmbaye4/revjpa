package sn.kcm.dev.revision_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.kcm.dev.revision_jpa.entities.Personne;

public interface PersonneRepos extends JpaRepository<Personne, Long> {
}
