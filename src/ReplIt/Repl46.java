package ReplIt;

import java.util.Scanner;

/*
Create a scanner object

Example # 1
-Display prompt: Enter your number:
12345
-Display prompt: 1
-Display prompt: 2
-Display prompt: 3
-Display prompt: 4
-Display prompt: 5

Example # 2

-Display prompt: Enter your number:
45678
-Display prompt: 4
-Display prompt: 5
-Display prompt: 6
-Display prompt: 7
-Display prompt: 8

Use / and % operators

 */
public class Repl46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, digit1 , digit2, digit3, digit4, digit5;
        //        1         2       3      4        5
        //
        System.out.println("Enter your number:");
        num = scanner.nextInt();
//        int b = num/10;
//        int c = b/10;
//        int d = c/10;
//        int e = d/10;
//        System.out.println(e%10);
//        System.out.println(d%10);
//        System.out.println(c%10);
//        System.out.println(b%10);
//        System.out.println(num%10);
        System.out.println(num / 10000);
        System.out.println(num % 10000 / 1000);
        System.out.println(num % 1000 / 100);
        System.out.println(num % 100 / 10);
        System.out.println(num % 10);

        }
    }

