package ReplIt;

import java.util.Scanner;
/*
Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com
 */
public class Repl072 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstname = "";
        String lastname = "";
        if (email.contains("_")) {
            firstname = email.substring(0, email.indexOf('_'));
            lastname = email.substring(email.indexOf('_') + 1, email.indexOf('@'));
            System.out.println(lastname.concat("_" + firstname + "@gmail.com"));
        }else {
            System.out.println(email);
        }


    }
}
