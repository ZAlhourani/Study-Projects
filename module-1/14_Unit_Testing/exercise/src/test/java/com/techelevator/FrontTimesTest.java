package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {

   private FrontTimes frontTimes = new FrontTimes();

    @Test

    public void generateString_should_return_ChoCho_if_giving_Chocolate_2 () {

        String newString = frontTimes.generateString("Chocolate", 2);

        Assert.assertEquals("ChoCho", newString);
    }

    @Test

    public void generateString_should_return_ChoChoCho_if_giving_Chocolate_3 () {

        String newString = frontTimes.generateString("Chocolate", 3);

        Assert.assertEquals("ChoChoCho", newString);
    }

    @Test

    public void generateString_should_return_AbcAbcAbc_if_giving_Abc_3 () {

        String newString = frontTimes.generateString("Abc", 3);

        Assert.assertEquals("AbcAbcAbc", newString);

    }
}
