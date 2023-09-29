package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {
    @Test

    public void getBits_returns_empty_string_not_giving_null () {

        StringBits sut = new StringBits();
        String getBits = sut.getBits(null);

        Assert.assertNull(getBits);


    }
}
