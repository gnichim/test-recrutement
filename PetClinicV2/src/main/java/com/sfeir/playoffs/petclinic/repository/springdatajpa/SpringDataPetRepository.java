package com.sfeir.playoffs.petclinic.repository.springdatajpa;

import com.sfeir.playoffs.petclinic.model.Pet;
import com.sfeir.playoffs.petclinic.model.PetType;
import com.sfeir.playoffs.petclinic.repository.PetRepository;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Spring Data JPA specialization of the {@link PetRepository} interface
 */
public interface SpringDataPetRepository extends PetRepository, Repository<Pet, Integer> {

    @Override
    @Query("SELECT ptype FROM PetType ptype ORDER BY ptype.name")
    List<PetType> findPetTypes() throws DataAccessException;
}
