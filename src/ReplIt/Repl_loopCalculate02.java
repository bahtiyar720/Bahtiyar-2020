package ReplIt;

import java.util.Scanner;

public class Repl_loopCalculate02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 1;
        for (int i =1; i<=n;i++){
            sum=sum*i;
        }
        System.out.println(sum);
    }
}
