package com.techelevator;

public class App {

    public static void main(String[] args) {

        UserProfile waltsProfile = new UserProfile("Walt", "Impellicceiri" , "walt@techelevator,com");

        UserProfile tomsProfile = new UserProfile("Tom", "Anderson", "tom@techelevator.com");

        String waltsFairstName =  waltsProfile.getFirstName();
        System.out.println(waltsFairstName);

        waltsProfile .setFirstName("Walter");
        waltsFairstName = waltsProfile.getFirstName();
        System.out.println(waltsFairstName);
    }
}
