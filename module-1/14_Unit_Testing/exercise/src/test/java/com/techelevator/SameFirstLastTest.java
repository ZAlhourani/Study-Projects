package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {

    SameFirstLast sameFirstLast = new SameFirstLast();

    @Test

    public void isItTheSame_should_return_false_if_not_the_same_first_last () {

        int[] inputArray = {1, 2, 3};

        boolean isItTheSame = sameFirstLast.isItTheSame(inputArray);

        Assert.assertFalse(isItTheSame);
    }

    @Test

    public void isItTheSame_should_return_true_if_the_same_first_last () {

        int[] inputArray = {1, 2, 3, 1};

        boolean isItTheSame = sameFirstLast.isItTheSame(inputArray);

        Assert.assertFalse(isItTheSame);
    }
}
