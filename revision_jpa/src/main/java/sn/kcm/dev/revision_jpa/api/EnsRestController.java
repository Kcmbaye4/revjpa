package sn.kcm.dev.revision_jpa.api;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.kcm.dev.revision_jpa.entities.Enseignant;
import sn.kcm.dev.revision_jpa.service.HospitalService;

import java.util.List;

@RestController
@AllArgsConstructor
public class EnsRestController {

    private HospitalService hospitalService;

    @GetMapping(path = "/ens")
    public List<Enseignant> showAllEns(){
        return hospitalService.getAllEns();
    }
}
