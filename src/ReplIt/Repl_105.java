package ReplIt;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_105 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
        //                     0                1                 2                 3              4
        String word[] = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            String firstlast = words[i].charAt(0)+""+words[i].charAt(words[i].length()-1)+"";
            word[i]=firstlast;

        }
        System.out.println(Arrays.toString(word));
    }
}
/*
bahtiyar
muhsin
abida
ablet
bykal
 */