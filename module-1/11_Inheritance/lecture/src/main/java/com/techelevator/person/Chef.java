package com.techelevator.person;

public class Chef extends Person {

    private String Specialty;
    private int yearsOfExperience;

    public Chef(String firstName, String lastName, int age, String specialty, int yearsOfExperience) {
       super(firstName, lastName, age);
        this.Specialty = specialty;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String specialty) {
        Specialty = specialty;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
