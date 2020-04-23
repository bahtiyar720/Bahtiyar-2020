package ReplIt;

import java.util.Scanner;

public class Repl_StringCharAt {
    public static void main(String[] args) {
        /*
        using charAt method output the 5th letter of txt string then the 6th letter then the 6th letter.

use print not println.
         */
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        System.out.print(txt.substring(2,3));
        System.out.print(txt.charAt(4));//foobar
        System.out.print(txt.charAt(5));
    }
}
