package ReplIt;

import java.util.Arrays;
import java.util.Scanner;
/*
Example:
input: abcXXXabc
output: 1

Example:
input: xxxabyyyycd
output: 3

Example:
input: java
output: 0
 */
public class Repl_099tripple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;

        for(int i = 0; i <= str.length() - 3; i++) {
            if(str.charAt(i) == str.charAt(i+1) &&
                    str.charAt(i) == str.charAt(i+2))
                count++;
        }

        System.out.println(count);
    }

}
