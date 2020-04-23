package ReplIt;

import java.util.Scanner;

public class Repl_092 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long num = n;
        while (n > 1) {
            num *= --n;
        }
        System.out.println(num);
    }
}
