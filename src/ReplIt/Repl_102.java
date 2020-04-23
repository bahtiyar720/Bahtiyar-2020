package ReplIt;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_102 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String word[] = new String[sentence.length()];
        word = sentence.split(" ");
        for (int i =word.length-1;i>=0;i--){
            System.out.println(word[i]);
        }
    }
}
