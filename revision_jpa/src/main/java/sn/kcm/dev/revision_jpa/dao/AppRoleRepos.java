package sn.kcm.dev.revision_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.kcm.dev.revision_jpa.entities.AppRole;
import sn.kcm.dev.revision_jpa.entities.AppUser;

public interface AppRoleRepos extends JpaRepository<AppRole, Long> {
    AppRole findByRoleName(String roleName);
}
