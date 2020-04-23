package ReplIt;

import java.util.Scanner;
/*
Given a string word, if the first or last chars are 'x' or 'X',
print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.
 */
public class Repl075 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String f = ""+word.charAt(0); //first char
        String l = ""+word.charAt(word.length()-1); // last char
        if (f.equalsIgnoreCase("x")&& l.equalsIgnoreCase("x")) {
            word = word.substring(1, word.length() - 1);
        }else if (f.equalsIgnoreCase("x")) {
            word = word.substring(1);
        }else if (l.equalsIgnoreCase("x")) {
            word = word.substring(0, word.length() - 1);
        }else {
            word = word;
        }
        System.out.println(word);
    }
}
