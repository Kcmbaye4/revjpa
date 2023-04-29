package sn.kcm.dev.revision_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.kcm.dev.revision_jpa.entities.Medecin;
import sn.kcm.dev.revision_jpa.entities.RendezVous;

public interface RDVRepos extends JpaRepository<RendezVous, Long> {
}
