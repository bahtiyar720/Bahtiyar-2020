package ReplIt;

import java.util.Scanner;

public class Repl066x {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        StringBuilder merge = new StringBuilder();
        if (word1.length()==word2.length()&&word1.length()==3) {
            for (int i = 0; i<word1.length()||i<word2.length();i++){
                if (i<word1.length())
                    merge.append(word1.charAt(i));
                if (i<word1.length())
                    merge.append(word2.charAt(i));
            }
            System.out.println(merge.toString());
        }else {
            System.out.println("cannot merge");
        }
    }

}
