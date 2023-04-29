package sn.kcm.dev.revision_jpa.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import sn.kcm.dev.revision_jpa.entities.*;

import java.util.List;

public interface HospitalService {

    List<Enseignant> getAllEns();
    AppUser addUser(AppUser appUser);
    AppRole addRole(AppRole appRole);

    //Etudiant addEtu(Etudiant etu);



    //AppUser findUserById(Long id);
    AppUser findUserByName(String name);
    AppRole findRoleByRoleName(String roleName);
    AppRole findRoleById(Long id);

    void addRoleToUser(String name, String roleName);

    Personne addPersonne(Personne personne);

    Medecin addMedecin(Medecin medecin);
    Patient addPatient(Patient patient);
    RendezVous addRDV(RendezVous rdv);
    Consultation addConsultation(Consultation consultation);
    List<Patient> getAllPatients();
    Medecin findMedecinById(Long id);
    Patient findPatientById(Long id);

    Page<Patient> findPatientByName(String name, Pageable pageable);
    List<Patient> getPatients();
    void deletePatientById(Long id);
}
