package com.techelevator;

import java.time.LocalDate;

public class UserProfile {
    // first name, last name, email, phone number, date of birth  ----> this is the first step
    private String firstName;  // ----> those are fields
    private String lastName;   // ----> those are fields
    private String email;
    private String phoneNumber;
    private LocalDate dataOfBirth;


    public UserProfile(String fName, String lName, String e) {       // this is the constructor
        firstName = fName;
        lastName = lName;
        email = e;
    }

    public UserProfile(String fName, String lName, String e, String phone, LocalDate dob) {
        firstName = fName;
        lastName = lName;
        email = e;
        phoneNumber = phone;
        dataOfBirth = dob;
    }

    // getters

    public String getFirstName() {
        return firstName;
    }

    //setters
    public void setFirstName(String fName) {
        firstName = fName;
    }


    // shortcuts ---> right click ----> generate


    // derived properties
    public String getFullName() {
        return firstName + " " + lastName;
    }


}
