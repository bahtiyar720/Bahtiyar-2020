package ReplIt;

/*
-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice
 */

import java.util.Scanner;

public class Repl22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        String item1 = scan.next();
        double price1 = scan.nextDouble();
        System.out.println("Enter Item2 and its price:");
        String item2 = scan.next();
        double price2 = scan.nextDouble();
        System.out.println("Enter Item3 and its price:");
        String item3 = scan.next();
        double price3 = scan.nextDouble();
        double totalPrice ;
        String report = "";
        report = "Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: " +
                ""+price2+", Item3: "+item3+" Price: "+price3;
        totalPrice =price1+price2+price3;
        System.out.println(report);
        System.out.println("Total price: "+totalPrice);



    }



}
