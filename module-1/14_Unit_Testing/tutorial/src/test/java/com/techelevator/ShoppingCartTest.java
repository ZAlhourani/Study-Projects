package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {

/*    @Test

    public void subtotal_should_equal_sum_of_all_items () {

        // arrange
        ShoppingCart cart = new ShoppingCart(0.10);

        cart.add(new Book("Dynamics of Software Development", "Jim McCarthy", 10.00));
        cart.add(new Movie("Zee", "PG-13", 115, 20.00));
        cart.add(new Coffee("Medium", "Bold", new String[]{"Cream"}, 10.00));

        // act
        double subTotal = cart.getSubtotalPrice();

        // assert
        Assert.assertEquals(40.00, subTotal, 0.00);
    }*/

    private ShoppingCart createAndFillCart() {
        // Create a shopping cart and add both taxable and non-taxable items to it.
        ShoppingCart cart = new ShoppingCart(0.10);     // 10% tax rate

        // Taxable $10 plus $1 tax
        cart.add( new Book("Dynamics of Software Development", "Jim McCarthy", 10.00));
        // Taxable $20 plus $2 tax
        cart.add( new Movie("Free Guy", "PG-13", 115, 20.00));
        // Not taxable $10
        cart.add( new Coffee("Jumbo", "Bold", new String[]{"cream"}, 10.00));
        return cart;
    }

    @Test
    public void subtotal_should_equal_sum_of_all_items() {
        // Arrange - Create a shopping cart with items
        ShoppingCart cart = createAndFillCart();

        // Act - get the subtotal
        double subtotal = cart.getSubtotalPrice();

        // Assert - Make sure value is correct
        Assert.assertEquals(40.00, subtotal, 0.00);
    }



}
