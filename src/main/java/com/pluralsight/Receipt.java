package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

public class Receipt {
    public static void main(String[] args) {
        String item = "Javas";
        double price = 67.67;

        int quantity = 4;

        System.out.println("I bought " + quantity + " " + item + " for $" + price * quantity);
    }
}
