package com.sfeir.playoffs.petclinic.repository.springdatajpa;

import com.sfeir.playoffs.petclinic.model.Vet;
import com.sfeir.playoffs.petclinic.repository.VetRepository;
import org.springframework.data.repository.Repository;

/**
 * Spring Data JPA specialization of the {@link VetRepository} interface
 */
public interface SpringDataVetRepository extends VetRepository, Repository<Vet, Integer> {
}
