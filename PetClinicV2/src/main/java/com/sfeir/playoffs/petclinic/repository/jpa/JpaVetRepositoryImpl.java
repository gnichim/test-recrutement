package com.sfeir.playoffs.petclinic.repository.jpa;

import com.sfeir.playoffs.petclinic.model.Vet;
import com.sfeir.playoffs.petclinic.repository.VetRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

/**
 * JPA implementation of the {@link VetRepository} interface.
 */
public class JpaVetRepositoryImpl implements VetRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @SuppressWarnings("unchecked")
    public Collection<Vet> findAll() {
        return this.em.createQuery("SELECT distinct vet FROM Vet vet left join fetch vet.specialties ORDER BY vet.lastName, vet.firstName").getResultList();
    }
}
