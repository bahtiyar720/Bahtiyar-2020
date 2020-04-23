package ReplIt;

import java.util.Arrays;

/*
Write a for loop that prints all the even integers from 80 through 20 inclusive, separated by spaces.
MUST USE FOR EACH LOOP
 */
public class Repl_113 {
    public static void main(String[] args) {

        String evenNumber = "";
       for (int i =80; i>=20; i-=2){
           evenNumber+=i+" ";
       }
       String even [] = evenNumber.split(" ");
       for (String each:even){
           System.out.print(each+" ");
       }
    }
}
