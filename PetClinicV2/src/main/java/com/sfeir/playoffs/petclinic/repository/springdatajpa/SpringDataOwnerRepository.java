package com.sfeir.playoffs.petclinic.repository.springdatajpa;

import com.sfeir.playoffs.petclinic.model.Owner;
import com.sfeir.playoffs.petclinic.repository.OwnerRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

/**
 * Spring Data JPA specialization of the {@link OwnerRepository} interface
 */
public interface SpringDataOwnerRepository extends OwnerRepository, Repository<Owner, Integer> {

    @Override
    @Query("SELECT DISTINCT owner FROM Owner owner left join fetch owner.pets WHERE owner.lastName LIKE :lastName%")
    Collection<Owner> findByLastNameStartingWith(@Param("lastName") String lastName);

    @Override
    Collection<Owner> findByLastNameLikeAndCity(@Param("lastName") String lastName, @Param("city") String city);

    @Override
    @Query("SELECT owner FROM Owner owner left join fetch owner.pets WHERE owner.id =:id")
    Owner findById(@Param("id") int id);
}
