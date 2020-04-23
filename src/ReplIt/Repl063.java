package ReplIt;

import java.util.Scanner;

public class Repl063 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        String allword = "";
        allword+= word1+word2+word2+word1;
        System.out.println(allword);
    }
}
