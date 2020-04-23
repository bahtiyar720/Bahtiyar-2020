package ReplIt;

import java.util.Scanner;

public class Repl_vichelRecaled {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.next();
        int year = scan.nextInt();
        boolean recalled = false;

        if (model.equals("Extravagant")&&year<=2012&&year>=2010){
            System.out.println(true);
        }else if (model.equals("Guzzler")&&year<=2018&&year>=2015){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
