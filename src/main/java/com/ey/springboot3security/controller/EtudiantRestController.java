package com.ey.springboot3security.controller;


import com.ey.springboot3security.entity.Etudiant;
import com.ey.springboot3security.entity.TypeChambre;
import com.ey.springboot3security.service.chambre.ChambreServiceImpl;
import com.ey.springboot3security.service.user.EtudiantService;

import com.ey.springboot3security.service.user.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("etudiant")
public class EtudiantRestController {

    IEtudiantService ietudiantservice;

    @GetMapping("afficheetudiants")
    List<Etudiant> retrieveAllEtudiants() {
        return ietudiantservice.retrieveAllEtudiant();
    }

    @PostMapping("ajouteretudiant")
    Etudiant addEtudiant(@RequestBody Etudiant e) {
        return ietudiantservice.addEtudiant(e);
    }

    @PutMapping("/updateEtudiant")
    ResponseEntity<Etudiant> updateEtudiant(@RequestBody Etudiant e) {
        return ietudiantservice.updateEtudiant(e);
    }

    @GetMapping("/afficheetudiant/{idetudiant}")
    Etudiant retrieveEtudiant(@PathVariable("idetudiant") Long idEtudiant) {
        return ietudiantservice.retrieveEtudiant(idEtudiant);
    }
}
