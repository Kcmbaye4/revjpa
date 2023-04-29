package sn.kcm.dev.revision_jpa.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import sn.kcm.dev.revision_jpa.entities.Medecin;
import sn.kcm.dev.revision_jpa.entities.Patient;

public interface PatientRepos extends JpaRepository<Patient, Long> {
    Page<Patient> findByNameContains(String name, Pageable pageable);
}
