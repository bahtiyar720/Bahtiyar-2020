package ReplIt;

import java.util.Scanner;

public class Repl35 {
    public static void main(String[] args) {
//if they are equal output  "word1 equals word2"
//else output "word1 does not equal word2"
        Scanner scan = new Scanner(System.in);
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();
        if (word1.equals(word2)){
            System.out.println("word1 equals word2");
        }else {
            System.out.println("word1 does not equal word2");
        }
    }
}
