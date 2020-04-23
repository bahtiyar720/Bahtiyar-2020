package ReplIt;

import java.util.Scanner;

public class Repl_burgerIf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*
        check if in (string variable) equals "burger" or "chicken"  and output the price 10.0

        also if input is "soda" output 2.0 (do this with another if)
         */


        String in = s.next();
        if (in.equalsIgnoreCase("burger")||in.equalsIgnoreCase("chicken")){
            System.out.println(10.0);
        }else {
            System.out.println(2.0);
        }
    }
}
