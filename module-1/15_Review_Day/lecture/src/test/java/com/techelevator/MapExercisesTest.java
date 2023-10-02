package com.techelevator;

import com.techelevator.bank.MapExercises;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapExercisesTest {
    @Test
    public void robPeterToPayPaul_does_nothing_when_peter_has_insufficient_funds () {

        // arrange
        Map<String, Integer> startingBalances = new HashMap<>();

        startingBalances.put("Paul", 1_000);
        startingBalances.put("Peter", 2_000);

        MapExercises sut = new MapExercises();

        // act
        Map<String, Integer> result = sut.robertToPayPull(startingBalances);

        // assert
        /*Assert.assertEquals(startingBalances, result);*/

        // or we can do this

        Assert.assertEquals(2, result.size());
        Assert.assertEquals(1_000, (int) result.get("Paul"));
        Assert.assertEquals(2_000, (int) result.get("Paul"));

    }


        @Test
        public void robPeterToPayPaul_transfers_half_of_peters_money() {

        Map<String,Integer> startingBalances = new HashMap<>();

        startingBalances.put("Paul", 1_000);
        startingBalances.put("Peter", 2_000);

        MapExercises sut = new MapExercises();

            Assert.assertEquals(2, result.size());
            Assert.assertEquals(1_000, (int) result.get("Paul"));
            Assert.assertEquals(2_000, (int) result.get("Paul"));



        }



}
