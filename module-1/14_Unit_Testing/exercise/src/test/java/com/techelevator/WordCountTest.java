package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class WordCountTest {

    private WordCount sut = new WordCount();

    @Test

    public void getCount_should_return_the_map_of_the_word_count_in_the_array (){

       String[] wordString = {"ba", "ba", "black", "sheep"};


        Map<String, Integer> getCount = sut.getCount(wordString);



        Assert.assertEquals(getCount.entrySet(), wordString);

    }
}
