package com.examenSpring.domain.service.farmacy;

import com.examenSpring.domain.repository.FarmacyRepository;
import com.examenSpring.persistence.entity.Farmacy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FarmacyServiceImpl implements FarmacyService{

    @Autowired
    private FarmacyRepository repository;

    @Override
    public List<Farmacy> findAll() {
        return (List<Farmacy>) repository.findAll();
    }

    @Override
    public Optional<Farmacy> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Farmacy save(Farmacy farmacy) {
        return repository.save(farmacy);
    }

    @Override
    public Optional<Farmacy> update(Long id, Farmacy farmacy) {
        Optional<Farmacy> getFarmacy = repository.findById(id);
        if (getFarmacy.isPresent()){
            Farmacy newFarmacy = getFarmacy.orElseThrow();
            newFarmacy.setNameFarmacy(farmacy.getNameFarmacy());
            newFarmacy.setAddressFarmacy(farmacy.getAddressFarmacy());
            newFarmacy.setLogoFarmacy(farmacy.getLogoFarmacy());
            newFarmacy.setLatFarmacy(farmacy.getLatFarmacy());
            newFarmacy.setLongFarmacy(farmacy.getLongFarmacy());
            newFarmacy.setCity(farmacy.getCity());

            return Optional.of(repository.save(newFarmacy));

        }
        return getFarmacy;
    }

    @Override
    public Optional<Farmacy> delete(Long id) {
        Optional<Farmacy> getFarmacy = repository.findById(id);
        getFarmacy.ifPresent(repository::delete);
        return getFarmacy;
    }
}
