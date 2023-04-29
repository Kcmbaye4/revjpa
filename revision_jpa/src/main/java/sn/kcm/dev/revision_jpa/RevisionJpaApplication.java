package sn.kcm.dev.revision_jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sn.kcm.dev.revision_jpa.entities.Patient;
import sn.kcm.dev.revision_jpa.service.HospitalService;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class RevisionJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RevisionJpaApplication.class, args);





		//List<String> fruits = new ArrayList<>();

		/*Stream.of("banane", "pomme", "ananas")
				.forEach(nf->{
					fruits.add(nf);
				});

				fruits.forEach(f->{
					System.out.println("----------------------");
					System.out.println("Nom du fruit : "+f);
				});*/
	}




	//@Bean
	CommandLineRunner start(HospitalService hospitalService){
		return args -> {
			/*Stream.of("Fall", "Ndoye", "Seck")
					.forEach(m->{
						Medecin medecin = new Medecin();
						medecin.setName(m);
						medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
						hospitalService.addMedecin(medecin);
					});

			Stream.of("Pat1", "Pat2", "Pat3")
					.forEach(p->{
						Patient patient = new Patient();
						patient.setName(p);
						patient.setDateNaissance(new Date());
						hospitalService.addPatient(patient);
					});

			Medecin medecin = hospitalService.findMedecinById(1L);
			Patient patient = hospitalService.findPatientById(2L);
			RendezVous rendezVous = new RendezVous();
			rendezVous.setStatusRDV(StatusRDV.PENDING);
			rendezVous.setDatDRDV(new Date());
			rendezVous.setMedecin(medecin);
			rendezVous.setPatient(patient);
			hospitalService.addRDV(rendezVous);

			Consultation consultation = new Consultation();
			consultation.setDateConsult(rendezVous.getDatDRDV());
			consultation.setRendezVous(rendezVous);
			consultation.setRapport("Ceci est un rappot du RDV");
			hospitalService.addConsultation(consultation);*/

			/*Stream.of("Luna", "Md")
					.forEach(name->{
						AppUser appUser = new AppUser();
						appUser.setName(name);
						appUser.setPassword("123456");
						hospitalService.addUser(appUser);
					});

			Stream.of("admin", "user").forEach(r->{
				AppRole appRole = new AppRole();
				appRole.setRoleName(r);
				hospitalService.addRole(appRole);
			});

			AppRole appRole = hospitalService.findRoleById(2L);
			AppUser appUser = hospitalService.findUserByUsername("Luna");

			hospitalService.addRoleToUser("Md", "admin");*/

			/*Stream.of("Leo", "Jean").forEach(name->{
				Enseignant enseignant = new Enseignant();
				enseignant.setName(name);
				enseignant.setMatiere(Math.random()>0.5?"HG":"FR");
				hospitalService.addPersonne(enseignant);
			});

			Stream.of("Aicha", "Candice").forEach(name->{
				Etudiant etudiant = new Etudiant();
				etudiant.setName(name);
				etudiant.setNote(Math.random()>0.5?14:17);
				hospitalService.addPersonne(etudiant);
			});*/

			/*Stream.of("Pat1", "Pat2", "Pat3")
					.forEach(p->{
						Patient patient = new Patient();
						patient.setName(p);
						patient.setDateNaissance(new Date());
						hospitalService.addPatient(patient);
					});*/


		};
	}

}
