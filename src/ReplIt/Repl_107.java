package ReplIt;

import java.util.Scanner;

public class Repl_107 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        //count even numer and print out
        int count = 0;
        for (int i = 0; i<nums.length; i++){
            if (nums[i]%2==0){
                count++;
            }
        }
        System.out.println(count);

    }
}
