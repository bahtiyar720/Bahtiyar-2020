package ReplIt;

import java.util.Scanner;

/*
Example1:

Display prompt: "Enter number of coupons:"
13
Display prompt: "Number of Candies: 1"
Display prompt: "Number of Gumballs: 1"

Example2:

Display prompt: "Enter number of coupons:"
23
Display prompt: "Number of Candies: 2"    10 coupons for a candy bar
Display prompt: "Number of Gumballs: 1"    3 coupons for a gumball.

Example3:

Display prompt: "Enter number of coupons:"
2
Display prompt: "Not enough coupons"
 */
public class Repl034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons = sc.nextInt();
        if(coupons<3){
            System.out.println("Not enough coupons");
        }else if (coupons>=3){
            System.out.println("Number of Candies: "+(coupons / 10));
            System.out.println("Number of Gumballs: "+(coupons % 10) /3 );
        }




        }


    }
