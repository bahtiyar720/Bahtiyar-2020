package ReplIt;

import java.util.Scanner;
/*
Write a program that will verify if word contains in the sentence. Print out the result as boolean value.
 */
public class Repl_verifyContainString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        if (sentence.contains(word)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
