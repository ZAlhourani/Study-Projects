package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class Lucky13Test {

    private Lucky13 lucky = new Lucky13();

    @Test


  public void getLucky_should_return_true_if_array_does_not_contain_1_or_3() {

      // arrange
      int[] nums = {7, 5, 2};

      // act
      boolean getLucky = lucky.getLucky(nums);

      // assert
      Assert.assertTrue(getLucky);
  }

    @Test


    public void getLucky_should_return_false_if_array_does_contain_1() {

        // arrange
        int[] nums = {1, 2, 4};

        // act
        boolean getLucky = lucky.getLucky(nums);

        // assert
        Assert.assertFalse(getLucky);
    }

    @Test


    public void getLucky_should_return_false_if_array_does_contain_3() {

        // arrange
        int[] nums = {4, 6, 3};

        // act
        boolean getLucky = lucky.getLucky(nums);

        // assert
        Assert.assertFalse(getLucky);
    }

    @Test


    public void getLucky_should_return_true_if_array_is_empty () {

        // arrange
        int[] nums = {};

        // act
        boolean getLucky = lucky.getLucky(nums);

        // assert
        Assert.assertTrue(getLucky);
    }

    @Test


    public void getLucky_should_return_true_if_array_is_null () {

        // arrange
        int[] nums = null;

        // act
        boolean getLucky = lucky.getLucky(nums);

        // assert
        Assert.assertTrue(getLucky);
    }





}
