package ReplIt;

import java.util.Scanner;

/*
Example:
input: 5
output: *
output: **
output: ***
output: ****
output: *****

Example:
input: 3
output: *
output: **
output: ***
 */
public class Repl_108triangle {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (i = 0; i < n; i++) {

            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}