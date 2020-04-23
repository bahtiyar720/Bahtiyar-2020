package ReplIt;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class Repl_090counJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int count = 0;
        for (int i = 0; i < word.length() - 3; i++) {
            if (word.substring(i, i + 4).equals("java")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
