package sn.kcm.dev.revision_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.kcm.dev.revision_jpa.entities.AppUser;
import sn.kcm.dev.revision_jpa.entities.Medecin;

public interface AppUserRepos extends JpaRepository<AppUser, String> {
    AppUser findByName(String name);
}
