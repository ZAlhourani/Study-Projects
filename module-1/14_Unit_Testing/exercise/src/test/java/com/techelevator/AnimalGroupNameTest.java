package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalGroupNameTest {


     private AnimalGroupName animalGroupName = new AnimalGroupName();


    @Test
    public void getHerd_should_return_Tower_when_given_giraffe() {
        String expected = "Crash";
        String actual = animalGroupName.getHerd("rhino");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHerd_should_return_unknown_when_given_empty_string() {
        String expected = "Tower";
        String actual = animalGroupName.getHerd("giraffe");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHerd_should_return_unknown_when_given_walrus() {
        String expected = "Herd";
        String actual = animalGroupName.getHerd("elephant");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHerd_should_return_Crash_when_given_Rhino() {
        String expected = "Pride";
        String actual = animalGroupName.getHerd("lion");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHerd_should_return_Crash_when_given_rhino() {
        String expected = "Murder";
        String actual = animalGroupName.getHerd("crow");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHerd_should_return_Herd_when_given_Elephant() {
        String expected = "Kit";
        String actual = animalGroupName.getHerd("pigeon");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHerd_should_return_Herd_when_given_elephant() {
        String expected = "Pat";
        String actual = animalGroupName.getHerd("flamingo");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHerd_should_return_Pride_when_given_Lion() {
        String expected = "Pride";
        String actual = animalGroupName.getHerd("Lion");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHerd_should_return_Pride_when_given_lion() {
        String expected = "Herd";
        String actual = animalGroupName.getHerd("deer");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHerd_should_return_pach_when_given_dog() {
        String expected = "Pack";
        String actual = animalGroupName.getHerd("dog");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHerd_should_return_float_when_given_crocodile() {
        String expected = "Float";
        String actual = animalGroupName.getHerd("crocodile");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHerd_should_return_unknown_when_given_null() {
        String expected = "Unknown";
        String actual = animalGroupName.getHerd("");
        Assert.assertEquals(expected, actual);
    }

}
