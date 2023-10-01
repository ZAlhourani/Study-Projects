package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {

       private CigarParty sut = new CigarParty();


        @Test

         public void haveParty_returns_false_if_the_cigar_count_is_not_between_40_and_60_in_weekdays() {

            // arrange


          // act

            boolean haveParty = sut.haveParty(30, false);

            // assert

            Assert.assertFalse(haveParty);


     }

    @Test

    public void haveParty_returns_true_if_the_cigar_count_is_between_40_and_60_in_weekdays() {

        // arrange


        // act

        boolean haveParty = sut.haveParty(50, true);

        // assert

        Assert.assertTrue(haveParty);

    }

    @Test

    public void haveParty_returns_true_if_the_cigar_count_is_not_in_range_in_weekends() {

        // arrange


        // act

        boolean haveParty = sut.haveParty(70, true);

        // assert

        Assert.assertTrue(haveParty);

    }
}
