package com.examenSpring.web.controller;

import com.examenSpring.domain.service.farmacy.FarmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/farmacy")
public class FarmacyController {

    @Autowired
    private FarmacyService service;

    @GetMapping
    private ResponseEntity<?> findAll(){
        return
    }

}
