package ReplIt;

import java.util.Scanner;

public class Repl_086catDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        for (int i=0; i< word.length()-2; i++) {

            if (word.substring(i,i+3).equals("cat")){
                countOfCats++;
            }else if (word.substring(i,i+3).equals("dog")){
                countOfDogs++;
            }

        }
        boolean result = countOfCats==countOfDogs?true:false;
        System.out.println(result);
    }
    }

