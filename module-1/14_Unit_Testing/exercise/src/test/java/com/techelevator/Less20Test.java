package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {

    Less20 less20 = new Less20();

    @Test

    public void isLessThanMultipleOf20_should_return_true_giving_18 () {

        boolean number = less20.isLessThanMultipleOf20(18);

        Assert.assertTrue(number);

    }

    @Test

    public void isLessThanMultipleOf20_should_return_true_giving_19 () {

        boolean number = less20.isLessThanMultipleOf20(19);

        Assert.assertTrue(number);

    }

    @Test

    public void isLessThanMultipleOf20_should_return_false_giving_20 () {

        boolean number = less20.isLessThanMultipleOf20(20);

        Assert.assertFalse(number);

    }


    }
