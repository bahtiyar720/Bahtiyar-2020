package ReplIt;

import java.util.Scanner;

public class Repl_097 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countjava = 0;
        int countpython = 0;
        for (int i = 0; i < sentence.length() - 3; i++) {

            if (sentence.substring(i, i + 4).equals("java")) {
                countjava++;
            }
        }
        for (int j = 0; j < sentence.length() - 5; j++) {
            if (sentence.substring(j, j + 6).equals("python")) {
                countpython++;
            }
        }if (countjava==countpython){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        }

    }
