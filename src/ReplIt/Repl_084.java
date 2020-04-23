package ReplIt;

import java.util.Scanner;
/*
example1- inhabitants is 6

Day 0 [6]
Day 1 [3]
Day 2 [1]
---- EXTINCT ----

example2- inhabitants is 0
---- EXTINCT ----

example3- inhabitants is 20
Day 0 [20]
Day 1 [10]
Day 2 [5]
Day 3 [2]
Day 4 [1]
---- EXTINCT ----
 */
public class Repl_084 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        for (int day = 0; day >= 0; day++) {

            if (inhabitants==0) {
                break;
            }
                System.out.println("Day " + day + " [" + inhabitants + "]");

            inhabitants /= 2;

        }
        System.out.println("---- EXTINCT ----");

    }
}
