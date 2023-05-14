package com.github.entity;

import javax.persistence.*;

@Entity(name = "Person")
@Table(name = "Person")
public class Person {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    private String family;

    private String nationalCode;

    private float salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public Person setFamily(String family) {
        this.family = family;
        return this;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public Person setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
        return this;
    }

    public float getSalary() {
        return salary;
    }

    public Person setSalary(float salary) {
        this.salary = salary;
        return this;
    }
}
