package ReplIt;

import java.util.Scanner;

/*
Write a program that will print out route instructions.
Your program should take 2 parameters: start point and end point. Use left, right, up and down
for navigation. Insert ">" between commands. If start point equals to end point - display:
 "start/end(start or end variable!) found".
Note: you may move only clock wise.
Example:
Input: A
Input: D
Output: right > down > left: D found

Input: C
Input: C
Output: C found

 */
public class Reple076 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();


        if (start.equalsIgnoreCase("A")) {
            if (end.equalsIgnoreCase("A")) {
                System.out.println(end + " found");
            } else if (end.equalsIgnoreCase("B")) {
                System.out.println("right: " + end + " found");
            } else if (end.equalsIgnoreCase("C")) {
                System.out.println("right > down: " + end + " found");
            } else if (end.equalsIgnoreCase("D")) {
                System.out.println("right > down > left: " + end + " found");
            }
        }
        if (start.equalsIgnoreCase("b")) {
            if (end.equalsIgnoreCase("b")) {
                System.out.println(end + " found");
            } else if (end.equalsIgnoreCase("c")) {
                System.out.println("down: " + end + " found");
            } else if (end.equalsIgnoreCase("d")) {
                System.out.println("down > left: " + end + " found");
            } else if (end.equalsIgnoreCase("a")) {
                System.out.println("down > left > up: " + end + " found");
            }
        }
        if (start.equalsIgnoreCase("c")) {
            if (end.equalsIgnoreCase("c")) {
                System.out.println(end + " found");
            } else if (end.equalsIgnoreCase("d")) {
                System.out.println("left: " + end + " found");
            } else if (end.equalsIgnoreCase("a")) {
                System.out.println("left > up: " + end + " found");
            } else if (end.equalsIgnoreCase("b")) {
                System.out.println("left > up > right: " + end + " found");
            }
        }
        if (start.equalsIgnoreCase("d")) {
            if (end.equalsIgnoreCase("d")) {
                System.out.println(end + " found");
            } else if (end.equalsIgnoreCase("a")) {
                System.out.println("up: " + end + " found");
            } else if (end.equalsIgnoreCase("b")) {
                System.out.println("up > right: " + end + " found");
            } else if (end.equalsIgnoreCase("c")) {
                System.out.println("up > right > down: " + end + " found");
            }
        }


    }
}
