package ReplIt;

import java.util.Scanner;

/*
Example:
Display message: Enter full name:
input: Max Payne
Display message: User found!
Max Payne and Alan Wake
 */
public class Repl_057 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String fullname = scan.nextLine();
        if (fullname.equalsIgnoreCase("Max Payne")){
            System.out.println("User found!");
        }else if (fullname.equalsIgnoreCase("Alan Wake")){
            System.out.println("User found!");
        }else {
            System.out.println("User not found!");
        }
    }


}
