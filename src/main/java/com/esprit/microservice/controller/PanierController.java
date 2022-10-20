package com.esprit.microservice.controller;

import com.esprit.microservice.model.Panier;
import com.esprit.microservice.service.PanierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
public class PanierController {

    @Autowired
    PanierService panierService;

    @PostMapping(value="/createPanier", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createPanier(@RequestBody Panier panier){
        panierService.createPanier(panier);
    }

    @GetMapping(value="/getAllPaniers")
    public List<Panier> getAllPaniers(){
        return panierService.getAllPaniers();
    }

}
