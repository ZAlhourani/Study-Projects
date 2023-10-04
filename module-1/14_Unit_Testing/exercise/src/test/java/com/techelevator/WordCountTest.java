package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class WordCountTest {

    private WordCount sut = new WordCount();

    @Test

    public void getCount_should_return_the_map_of_the_word_count_in_the_array(){

        // arrange

       String[] wordString = {"ba", "ba", "black", "sheep"};


        Map<String, Integer> getCount = sut.getCount(wordString);

        getCount.put("ba", 2);
        getCount.put("black", 1);
        getCount.put("sheep", 1);

        // act

        Map<String, Integer> result = sut.getCount(wordString);


        // assert

        Assert.assertEquals(getCount, result);

    }

    @Test

    public void getCount_should_return_the_map_of_the_word_count_in_the_array_V2(){

        String[] wordString = {"ba", "ba", "black", "sheep"};


        Map<String, Integer> result = sut.getCount(wordString);


        Assert.assertEquals(3, result.size());
        Assert.assertEquals(2, (int) result.get("ba"));
        Assert.assertEquals(1, (int) result.get("black"));
        Assert.assertEquals(1, (int) result.get("sheep"));

    }


}
