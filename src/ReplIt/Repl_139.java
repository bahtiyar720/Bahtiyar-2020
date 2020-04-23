package ReplIt;

import java.util.Scanner;

public class Repl_139 {
    public static void main(String[] args) {

        plus();
    }

    public static void plus(){

        //your code here

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        num1+=num2;
        System.out.println("result: "+num1);

    }
}
