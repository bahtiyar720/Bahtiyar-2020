package ReplIt;

import java.util.Scanner;

public class Repl087 {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int a = word.indexOf("java");
        if (a==0||a==1){
            System.out.println(!exists);
        }else {
            System.out.println(exists);
        }



    }
}
