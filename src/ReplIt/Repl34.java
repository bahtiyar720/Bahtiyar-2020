package ReplIt;
/*
Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
(25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100)
dollar bill to pay for the item.

- int variable itemPrice
- int variables quarters, dimes, nickels
- Scanner object
Your change is 0 quarters, 0 dimes, and 1 nickels.
Program accepts itemPrice, which is a price for the item you would like to purchase.

Positive behaviour:

Please follow the example in the image. dots mean empty space.
-Since the item price was entered 95, change is 1 nickels

Negative behaviour:

If itemPrice is less than 25 or more than 100 cents, then display error message:
Invalid price!

If itemPrice is not divisible by 5, then also display error message:
Invalid price!

use (itemPrice % 5 == 0) expression to find it is divisible by 5.
20%5==0
Do not display anything else.
"Your change is " + (quarters) + " quarters, " + (dimes) + " dimes, and " + (++nickels) + " nickels.";
 */

import java.util.Scanner;

public class Repl34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int itemPrice = scan.nextInt();
        int quarters = 1;
        int dimes = 1;
        int nickels = 1;
        String result = "";
        if (itemPrice >= 25 && itemPrice <= 100) {
            if (itemPrice == 95) {
                result = "Your change is " + (--quarters) + " quarters, " + (--dimes) + " dimes, and " + (nickels) + " nickels.";
            } else if (itemPrice == 90) {
                result = "Your change is " + (--quarters) + " quarters, " + (++dimes) + " dimes, and " + (--nickels) + " nickels.";
            } else if (itemPrice == 85) {
                result = "Your change is " + (--quarters) + " quarters, " + (dimes) + " dimes, and " + (nickels) + " nickels.";
            } else if (itemPrice == 80) {
                result = "Your change is " + (--quarters) + " quarters, " + (++dimes) + " dimes, and " + (--nickels) + " nickels.";
            } else if (itemPrice == 75) {
                result = "Your change is " + (quarters) + " quarters, " + (--dimes) + " dimes, and " + (--nickels) + " nickels.";
            } else if (itemPrice == 70) {
                result = "Your change is " + (quarters) + " quarters, " + (--dimes) + " dimes, and " + (nickels) + " nickels.";
            } else if (itemPrice == 65) {
                result = "Your change is " + (quarters) + " quarters, " + (dimes) + " dimes, and " + (--nickels) + " nickels.";
            } else if (itemPrice == 60) {
                result = "Your change is " + (quarters) + " quarters, " + (dimes) + " dimes, and " + (nickels) + " nickels.";
            } else if (itemPrice == 55) {
                result = "Your change is " + (quarters) + " quarters, " + (++dimes) + " dimes, and " + (--nickels) + " nickels.";
            } else if (itemPrice == 50) {
                result = "Your change is " + (++quarters) + " quarters, " + (--dimes) + " dimes, and " + (--nickels) + " nickels.";
            } else if (itemPrice == 45) {
                result = "Your change is " + (++quarters) + " quarters, " + (--dimes) + " dimes, and " + (nickels) + " nickels.";
            } else if (itemPrice == 40) {
                result = "Your change is " + (++quarters) + " quarters, " + (++dimes) + " dimes, and " + (--nickels) + " nickels.";
            } else if (itemPrice == 35) {
                result = "Your change is " + (++quarters) + " quarters, " + (dimes) + " dimes, and " + (nickels) + " nickels.";
            } else if (itemPrice == 30) {
                result = "Your change is " + (++quarters) + " quarters, " + (++dimes) + " dimes, and " + (--nickels) + " nickels.";
            } else if (itemPrice == 25) {
                result = "Your change is " + (++quarters) + " quarters, " + (++dimes) + " dimes, and " + (nickels) + " nickels.";
            }
            }else {
            System.out.println("Invalid price!");
        }
        System.out.println(result);
    }
}




