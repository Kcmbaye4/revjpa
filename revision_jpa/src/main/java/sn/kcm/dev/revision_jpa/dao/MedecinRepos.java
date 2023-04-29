package sn.kcm.dev.revision_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.kcm.dev.revision_jpa.entities.Medecin;

public interface MedecinRepos extends JpaRepository<Medecin, Long> {
}
