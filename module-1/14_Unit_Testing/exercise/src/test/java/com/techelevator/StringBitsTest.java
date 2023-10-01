package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {

    StringBits sut = new StringBits();

    @Test

    public void getBits_returns_Hlo_string_giving_Hello() {

        String str = "Hello";

        String getBits = sut.getBits(str);

        Assert.assertEquals("Hlo", getBits);

    }

    @Test

    public void getBits_returns_H_string_giving_Hi() {

        String str = "Hi";

        String getBits = sut.getBits(str);

        Assert.assertEquals("H", getBits);

    }

    @Test

    public void getBits_returns_Hello_string_giving_Heeololeo() {

        String str = "Heeololeo";

        String getBits = sut.getBits(str);

        Assert.assertEquals("Hello", getBits);
    }
}

