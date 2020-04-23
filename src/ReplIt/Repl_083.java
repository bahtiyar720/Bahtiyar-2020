package ReplIt;

import java.util.Scanner;

/*
Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no

Guest's list: Nick, Linda
 */
public class Repl_083 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String guestlist = "";
        while (true) {
            System.out.println("Please enter guest name:");
            String guestName = input.nextLine();
            guestlist += ", "+guestName;
            System.out.println("Do you want to enter new guest name:");
            String answer = input.nextLine();

                if (answer.equalsIgnoreCase("yes")) {
                    guestName+=guestlist;
                } else if (answer.equalsIgnoreCase("no")) {
                    System.out.println("Guest's list: " + guestlist.substring(2,guestlist.length()));
                    System.exit(0);


                }

            }
        }
    }



