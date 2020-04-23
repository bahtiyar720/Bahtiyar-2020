package ReplIt;

import java.util.Scanner;

/*
Write a program that asks user to input int values: areaCode and localNumber.

-Using concatenation put together in this format and assign to String phoneNumber  variable:

-(222)-3334444

-Write a print statement that displays (use phoneNumber variable ):
Calling number (222)-3334444
 */
public class Repl23 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please put areaCode and LocalNumber:");
        int areaCode = scan.nextInt();
        int localNumber = scan.nextInt();
        String phoneNumber = "("+areaCode+")-"+localNumber;
        System.out.println("Calling number "+phoneNumber);

    }
}
