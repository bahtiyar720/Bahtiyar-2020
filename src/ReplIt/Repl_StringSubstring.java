package ReplIt;

import java.util.Scanner;

/*
using substring method output the first two letters of text string
for examole:
String txt = "foo"
the first two letters are "fo"


use print not println.
 */
public class Repl_StringSubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstttwo = scan.nextLine();
        System.out.println(firstttwo.substring(0,2));
    }
}
