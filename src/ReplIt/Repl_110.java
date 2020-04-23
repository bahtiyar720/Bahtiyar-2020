package ReplIt;

import java.util.Scanner;

public class Repl_110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int counteven = 0;
        for (int each:nums){
            if (each%2==0){
                counteven++;
            }
        }
        System.out.println(counteven);
    }
}
