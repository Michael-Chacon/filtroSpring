package com.examenSpring.domain.service.farmacy;

import com.examenSpring.persistence.entity.Farmacy;

import java.util.List;
import java.util.Optional;

public interface FarmacyService {
    List<Farmacy> findAll();
    Optional<Farmacy> findById(Long id);
    Farmacy save(Farmacy farmacy);
    Optional<Farmacy> update(Long id, Farmacy farmacy);
    Optional<Farmacy> delete(Long id);

}
