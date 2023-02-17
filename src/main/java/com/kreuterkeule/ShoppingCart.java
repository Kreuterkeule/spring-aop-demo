package com.kreuterkeule;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status) {

        //Logging
        //Authentication and Authorization
        //Sanitize the Data

        System.out.println("Checkout method from ShoppingCart " + status);
    }

    public int getQuantitiy() {
        return 2;
    }
}
