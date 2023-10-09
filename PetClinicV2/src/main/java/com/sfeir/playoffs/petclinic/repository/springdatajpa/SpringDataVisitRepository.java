package com.sfeir.playoffs.petclinic.repository.springdatajpa;

import com.sfeir.playoffs.petclinic.model.Visit;
import com.sfeir.playoffs.petclinic.repository.VisitRepository;
import org.springframework.data.repository.Repository;

/**
 * Spring Data JPA specialization of the {@link VisitRepository} interface
 */
public interface SpringDataVisitRepository extends VisitRepository, Repository<Visit, Integer> {
}
