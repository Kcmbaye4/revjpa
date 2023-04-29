package sn.kcm.dev.revision_jpa.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import sn.kcm.dev.revision_jpa.dao.*;
import sn.kcm.dev.revision_jpa.entities.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
@Transactional
public class HospitalServiceImpl implements HospitalService {

    private MedecinRepos medecinRepos;
    private PatientRepos patientRepos;
    private RDVRepos rdvRepos;

    private AppUserRepos appUserRepos;

    private AppRoleRepos appRoleRepos;
    private ConsultationRepos consultationRepos;

    private PersonneRepos personneRepos;

    private EtudRepos etudRepos;

    private EnsRepos ensRepos;

    @Override
    public List<Enseignant> getAllEns() {
        return ensRepos.findAll();
    }

    @Override
    public AppUser addUser(AppUser appUser) {
        appUser.setId(UUID.randomUUID().toString());
        appUser.setUsername(appUser.getName()+"@gmail.com".toLowerCase());
        return appUserRepos.save(appUser);
    }

    @Override
    public AppRole addRole(AppRole appRole) {
        return appRoleRepos.save(appRole);
    }

    @Override
    public AppUser findUserByName(String name) {
        return appUserRepos.findByName(name);
    }

    @Override
    public AppRole findRoleByRoleName(String roleName) {
        return appRoleRepos.findByRoleName(roleName);
    }

    @Override
    public AppRole findRoleById(Long id) {
        return appRoleRepos.findById(id).orElse(null);
    }

    @Override
    public void addRoleToUser(String name, String roleName) {
        AppUser appUser = findUserByName(name);
        AppRole appRole = findRoleByRoleName(roleName);
        if(appUser.getAppRoles()!=null){
            appUser.getAppRoles().add(appRole);
            appRole.getAppUsers().add(appUser);
        }
    }

    @Override
    public Personne addPersonne(Personne personne) {
        return personneRepos.save(personne);
    }

    @Override
    public Medecin addMedecin(Medecin medecin) {
        return medecinRepos.save(medecin);
    }

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepos.save(patient);
    }

    @Override
    public RendezVous addRDV(RendezVous rdv) {
        return rdvRepos.save(rdv);
    }

    @Override
    public Consultation addConsultation(Consultation consultation) {
        return consultationRepos.save(consultation);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepos.findAll();
    }

    @Override
    public Medecin findMedecinById(Long id) {
        return medecinRepos.findById(id).orElse(null);
    }

    @Override
    public Patient findPatientById(Long id) {
        return patientRepos.findById(id).orElse(null);
    }

    @Override
    public Page<Patient> findPatientByName(String name, Pageable pageable) {
        return patientRepos.findByNameContains(name, pageable);
    }

    @Override
    public List<Patient> getPatients() {
        return patientRepos.findAll();
    }

    @Override
    public void deletePatientById(Long id) {
        patientRepos.deleteById(id);
    }
}
