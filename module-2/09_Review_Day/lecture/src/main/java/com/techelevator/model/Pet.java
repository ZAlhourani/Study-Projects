package com.techelevator.model;

import java.time.LocalDate;

public class Pet {

    private int id;
    private String name;
    private String type;
    private LocalDate birthDate;
    private String owner;

    public Pet() {
    }

    public Pet(int id, String name, String type, LocalDate birthDate, String owner) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.birthDate = birthDate;
        this.owner = owner;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
