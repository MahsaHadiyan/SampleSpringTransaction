package com.github;


import com.github.common.Spring;
import com.github.entity.Person;
import com.github.service.PersonService;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Person person = new Person();
        person.setName("Jamal");
        person.setFamily("test");
        person.setSalary(2000f);
        person.setNationalCode("00180561561");
        PersonService service = (PersonService) Spring.getBean("personService");
        service.save3(person);

        for (Person dbPerson : service.findAll()) {
            System.out.println(dbPerson.getId());
            System.out.println(dbPerson.getName());
        }

    }
}
