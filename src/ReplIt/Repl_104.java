package ReplIt;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class Repl_104 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        boolean result = true;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 5 && nums[i] == nums[i + 1]) {
                count++;
            }

        }
        if (count > 0) {
            System.out.println(true);
        } else {
            System.out.println(!true);
        }
    }

}




