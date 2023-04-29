package sn.kcm.dev.revision_jpa.api;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import sn.kcm.dev.revision_jpa.entities.Patient;
import sn.kcm.dev.revision_jpa.service.HospitalService;

import javax.validation.Valid;

@Controller
@AllArgsConstructor
public class HospitalController {

    private HospitalService hospitalService;

    @GetMapping(path = "/home")
    public String showAllPatients(Model model,
                                  @RequestParam(name = "page", defaultValue = "0") int page,
                                  @RequestParam(name = "size", defaultValue = "3") int size,
                                  @RequestParam(name ="keyword", defaultValue = "") String keyword){
        Page<Patient> pagePatients = hospitalService.findPatientByName(keyword, PageRequest.of(page, size));
        model.addAttribute("patients", pagePatients.getContent());
        model.addAttribute("kw", keyword);
        model.addAttribute("currentPage", page);
        model.addAttribute("nbPage", new int[pagePatients.getTotalPages()]);
        return "index";
    }

    @GetMapping("/formPatient")
    public String showFormPatient(Model model){
        model.addAttribute("patient", new Patient());
        return "addP";
    }

    @PostMapping("/add")
    public String addPatient(Model model, @Valid Patient patient, @RequestParam(defaultValue = "0") int page,
                             @RequestParam(defaultValue = "") String keyword, BindingResult bindingResult){
        if (bindingResult.hasErrors()) return "addP";
        model.addAttribute("patient", patient);
        hospitalService.addPatient(patient);
        return "redirect:/home?page="+page+"&keyword="+keyword;
    }

    @GetMapping("/delete")
    public String deletePatient(Long id, int page, String keyword){
        hospitalService.deletePatientById(id);
        return "redirect:/home?page="+page+"&keyword="+keyword;
    }

    @GetMapping("formUpdate")
    public String formUpdate(Model model, Long id, int page, String keyword){
        Patient patient = hospitalService.findPatientById(id);
        if(patient==null) throw new RuntimeException("Patient introuvable");
        model.addAttribute("currentPage", page);
        model.addAttribute("kw", keyword);
        model.addAttribute("patient", patient);
        return "modifP";
    }



    /*@GetMapping("smt")
    public String showPatients(Model model){
        model.addAttribute("")
        return "index";
    }*/


}
