package ReplIt;

import java.util.Scanner;

public class Repl_convertabYnerry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for(int i =0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }

        //TODO: Write your code below.
        int result=0;
        int p =0;
        for (int j=binary.length-1; j >=0; j--){
            result += binary[j] * 2*Math.pow(2,p);  /* pow ==> 2 * (0, 1, 2 etc)  */
            p++;
        }
        System.out.println(result/2);
    }
}


