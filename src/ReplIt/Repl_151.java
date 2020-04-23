package ReplIt;

import java.util.Arrays;

public class Repl_151 {
    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE

        for (int each : nums) {
            int count = 0;
            for (int each1 : nums) {
                if (each == each1) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }
        }
    }


    public static void main(String[] args) {
        int num[] = {9, 2, 5, 5, 6, 3, 6, 9, 34, 3};
        printUniqueNumbers(num);
    }
}
