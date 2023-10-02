package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {

    private DateFashion dateFashion = new DateFashion();

    @Test
    public void getATable_should_returns_2_if_either_is_8_or_above() {

        int youAndDate = dateFashion.getATable(5, 10);

        Assert.assertEquals(2, youAndDate);

    }

    @Test
    public void getATable_should_returns_0_if_either_is_less_than_8() {

        int youAndDate = dateFashion.getATable(5, 2);


        Assert.assertEquals(0, youAndDate);

    }
    @Test
    public void getATable_should_returns_1_otherwise() {

        int youAndDate = dateFashion.getATable(5, 5);

        Assert.assertEquals(1, youAndDate);

    }

}
