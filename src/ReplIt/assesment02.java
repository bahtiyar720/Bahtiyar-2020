package ReplIt;

import java.util.Scanner;

public class assesment02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
       if (num1>num2&&num1>num3){
           System.out.println("n1 is bigger");
       }if (num2>num1&&num2>num3){
            System.out.println("n2 is bigger");
        }if (num3>num1&&num3>num2){
            System.out.println("n3 is bigger");
        }
    }
}
