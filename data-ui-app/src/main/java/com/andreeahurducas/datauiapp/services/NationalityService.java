package com.andreeahurducas.datauiapp.services;

import com.andreeahurducas.datauiapp.models.Nationality;
import com.andreeahurducas.datauiapp.repositories.NationalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class NationalityService {
    @Autowired
    private NationalityRepository nationalityRepository;

    public List<Nationality> getNationalities() {
        return (List<Nationality>) nationalityRepository.findAll();
    }


    public Nationality getNationalityById(Integer id) {
        return nationalityRepository.findById(id).orElse(null);
    }

    public void addNationality(Nationality nationality) {
        nationalityRepository.save(nationality);
    }

    public void updateNationality(Nationality nationality) {
        nationalityRepository.save(nationality);
    }

    public void deleteNationality(Integer id){
        nationalityRepository.deleteById(id);
    }
}
