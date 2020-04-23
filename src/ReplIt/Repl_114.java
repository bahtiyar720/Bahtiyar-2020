package ReplIt;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_114 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int num3 = 0;
        for (int each:nums){
            for (int each1:nums){
                if (each!=each1){
                    num3 = each1;
                }
                System.out.println(num3);
            }

        }


    }

}
