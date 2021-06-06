package com.example.springclinic.services.springdatajpa;

import com.example.springclinic.model.Specialty;
import com.example.springclinic.repositories.SpecialtyRepository;
import com.example.springclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.awt.desktop.OpenFilesEvent;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("spingdatajpa")
public class SpecialtySDJpaService implements SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    public SpecialtySDJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialties = new HashSet<>();
        specialtyRepository.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public Specialty findById(Long aLong) {
//        Optional<Specialty> optionalSpecialty = specialtyRepository.findById(aLong);
//        return optionalSpecialty.isPresent() ? optionalSpecialty.get() : null;
        return specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Specialty object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}
