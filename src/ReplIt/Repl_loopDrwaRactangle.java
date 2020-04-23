package ReplIt;

import java.util.Scanner;

public class Repl_loopDrwaRactangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("***");
        for (int i = 1; i<=n; i++){
            System.out.println("* *");
        }
        System.out.println("***");
    }
}
