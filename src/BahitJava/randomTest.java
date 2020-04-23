package BahitJava;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;

public class randomTest {
    public static void main(String[] args) {
/*
        1. write a program that can find the maximum number from any given int array
        NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
        2. write a program that can find the minimum number from any given int array
        NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE
        Scanner scan = new Scanner(System.in);

 */
       Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number");
        int num [] = new int[5];
        int max = -9999999;
        int maxnumber = 0;
        for (int i = 0; i<=num.length-1;i++){
            num[i] = sc.nextInt();
            if (num[i]>max){
             maxnumber=num[i];
            }
        }
        System.out.println("max number is: "+maxnumber);
        System.out.println("===============================================");
        System.out.println("please enter the number");
        int num2 [] = new int[5];
        int min = 999999999;
        int minnumber = 0;
        for (int k = 0; k<=num2.length-1;k++){
            num[k] = sc.nextInt();
            if (num2[k]<min){
                minnumber=num[k];
            }
        }
        System.out.println("min number is: "+minnumber);

    }
}








