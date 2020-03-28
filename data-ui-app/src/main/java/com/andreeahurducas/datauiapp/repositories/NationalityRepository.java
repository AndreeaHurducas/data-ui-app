package com.andreeahurducas.datauiapp.repositories;

import com.andreeahurducas.datauiapp.models.Nationality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalityRepository extends CrudRepository <Nationality,Integer> {
}
