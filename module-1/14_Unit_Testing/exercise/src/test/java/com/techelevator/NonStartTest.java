package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {

    NonStart nonStart = new NonStart();

    @Test

    public void getPartialString_should_return_no_start_letter () {

        String str1 = "Hello";
        String str2 = "There";
        String expected = "ellohere";

        String getPartialString = nonStart.getPartialString(str1,str2);

        Assert.assertEquals(expected, getPartialString);
    }

    @Test

    public void getPartialString_should_return_empty_string_if_null () {

        String str1 = null;
        String str2 = null;
        String expected = "";

        String getPartialString = nonStart.getPartialString(str1,str2);

        Assert.assertEquals(expected, getPartialString);
    }

    @Test

    public void getPartialString_should_return_empty_string_if_lengthA_is_not_1 () {

        String str1 = "";
        String str2 = "T";
        String expected = "T";

        String getPartialString = nonStart.getPartialString(str1,str2);

        Assert.assertEquals(expected, getPartialString);
    }

    @Test

    public void getPartialString_should_return_empty_string_if_lengthB_is_not_1 () {

        String str1 = "H";
        String str2 = "";
        String expected = "H";

        String getPartialString = nonStart.getPartialString(str1,str2);

        Assert.assertEquals(expected, getPartialString);
    }

    @Test

    public void getPartialString_should_return_empty_string_if_both_empty () {

        String str1 = "";
        String str2 = "";
        String expected = "";

        String getPartialString = nonStart.getPartialString(str1,str2);

        Assert.assertEquals(expected, getPartialString);
    }
}
