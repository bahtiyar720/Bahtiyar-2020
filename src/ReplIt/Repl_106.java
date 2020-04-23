package ReplIt;

import java.util.Scanner;

public class Repl_106 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String [] word = new String[sentence.length()];
        word = sentence.split(" ");
        for (String each:word){
            System.out.println(each);
        }
    }
}
