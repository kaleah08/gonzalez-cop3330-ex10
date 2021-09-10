package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        String firstString = input.next();
        int itemOne = Integer.parseInt(firstString);

        System.out.print("Enter the quantity of item 1: ");
        String secondString = input.next();
        int quantityOne = Integer.parseInt(secondString);

        System.out.print("Enter the price of item 2: ");
        String thirdString = input.next();
        int itemTwo = Integer.parseInt(thirdString);

        System.out.print("Enter the quantity of item 2: ");
        String fourthString = input.next();
        int quantityTwo = Integer.parseInt(fourthString);

        System.out.print("Enter the price of item 3: ");
        String fifthString = input.next();
        int itemThree = Integer.parseInt(fifthString);

        System.out.print("Enter the quantity of item 3: ");
        String sixthString = input.next();
        int quantityThree = Integer.parseInt(sixthString);


        double priceOne = quantityOne * itemOne;
        double priceTwo = quantityTwo * itemTwo;
        double priceThree = quantityThree * itemThree;

        double subtotal = priceOne + priceTwo + priceThree;

        double taxRate = 0.055;
        double tax = subtotal * taxRate;

        double total = subtotal + tax;

        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Tax: $"  + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));

    }
}
