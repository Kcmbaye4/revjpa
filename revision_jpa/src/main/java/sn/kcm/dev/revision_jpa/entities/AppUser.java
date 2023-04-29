package sn.kcm.dev.revision_jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class AppUser implements Serializable {
    @Id
    private String id;
    @Column(unique = true)
    private String name;
    private String username;
    private String password;

    @ManyToMany(mappedBy = "appUsers", fetch = FetchType.EAGER)
    private Collection<AppRole> appRoles = new ArrayList<>();
}
