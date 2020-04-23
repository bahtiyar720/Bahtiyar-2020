package ReplIt;

import java.util.Scanner;

public class Repl_StringLength {
    public static void main(String[] args) {
        /*
        ask the user for his name, capture it on a string using scanner.

then output the length of the name string.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your first Name and Last Name!");
        String firstname = scan.nextLine();
        String lastname = scan.nextLine();
        System.out.println(firstname.length());
        System.out.println(lastname.length());
    }
}
