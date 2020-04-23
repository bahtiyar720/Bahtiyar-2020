package ReplIt;

import java.util.Scanner;

/*
for example:

in = "burger"

output: 10.0

in = "chicken "

output: 10.0

in = "soda"

output: 2.0

hint or operator in java is  ||

 */
public class Repl45 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();

        double result = (in.equals("burger"))?10.0:(in.equals("chicken"))?10.0:2.0;
        System.out.println(result);
    }

}
