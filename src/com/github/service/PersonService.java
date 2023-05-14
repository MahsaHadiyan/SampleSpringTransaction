package com.github.service;


import com.github.entity.Person;
import com.github.repository.PersonDA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonDA personDA;

    @Transactional(propagation = Propagation.REQUIRED)
    public void save(Person person) {
        personDA.save(person);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save1(Person person) {
        personDA.save(person);
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public void save2(Person person) {
        personDA.save(person);
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void save3(Person person) {
        personDA.save(person);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void save4(Person person) {
        personDA.save(person);
    }
    public List<Person> findAll()
    {
      return personDA.findAll();
    }

}
