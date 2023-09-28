package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Review {

    private List<Integer> nums = new ArrayList<>();

    public Integer[] getNums() {
        Integer[] numsArray = new Integer[nums.size()];

        return nums.toArray(numsArray);
    }
}
