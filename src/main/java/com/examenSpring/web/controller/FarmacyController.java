package com.examenSpring.web.controller;

import com.examenSpring.domain.service.farmacy.FarmacyService;
import com.examenSpring.persistence.entity.Farmacy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/farmacy")
public class FarmacyController {

    @Autowired
    private FarmacyService service;

    @GetMapping
    private ResponseEntity<?> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Farmacy> view(@PathVariable Long id) {
        Optional<Farmacy> getFarmacy = service.findById(id);
        if (getFarmacy.isPresent()) {
            return ResponseEntity.ok(getFarmacy.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Farmacy> save(@RequestBody Farmacy farmacy) {
        Farmacy data = service.save(farmacy);
        return ResponseEntity.status(HttpStatus.CREATED).body(data);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Farmacy> update(@PathVariable Long id, @RequestBody Farmacy farmacy) {
        Optional<Farmacy> data = service.update(id, farmacy);
        if (data.isPresent()) {
            return ResponseEntity.status(HttpStatus.CREATED).body(data.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Farmacy> delete(@PathVariable Long id) {
        Optional<Farmacy> farmacy = service.delete(id);
        if (farmacy.isPresent()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.notFound().build();
    }

}
