package ReplIt;

import java.util.Scanner;
/*
write a program that asks the user for his first name and last name.

use a scanner to get the use input.
 */
public class Repl_input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name and last me:");
        String firstname = scan.next();
        String lastname = scan.next();
        String fullname = firstname+" "+lastname;
        System.out.println(fullname);

    }


}
