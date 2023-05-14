package com.github.repository;

import com.github.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PersonDA {
    @PersistenceContext//ThreadSafe
    private EntityManager entityManager;


    public void save(Person person) {
        entityManager.persist(person);
    }


    public void delete(Person person) {
        entityManager.remove(entityManager.merge(person));
    }


    public void update(Person person) {
        entityManager.merge(person);
    }

    public List<Person> findAll() {
        return entityManager.createQuery("SELECT O FROM Person O").getResultList();
    }
}
