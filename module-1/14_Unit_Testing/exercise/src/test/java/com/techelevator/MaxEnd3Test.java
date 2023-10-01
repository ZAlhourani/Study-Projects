package com.techelevator;

import org.junit.Assert;
import org.junit.Test;


public class MaxEnd3Test {

    MaxEnd3 maxEnd3 = new MaxEnd3();

    @Test

    public void makeArray_should_return_highest_number_3_times () {

        int[] inputArray = {1, 2, 3};
        int[] expectedArray = {3, 3, 3};

        int [] newArray = maxEnd3.makeArray(inputArray);

        Assert.assertArrayEquals(expectedArray,inputArray);
    }


}
