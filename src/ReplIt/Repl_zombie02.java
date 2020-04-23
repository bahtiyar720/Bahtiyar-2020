package ReplIt;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_zombie02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        int day = 0;
        int inhab[] = new int[8];
        do {
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            day++;

            for (int j = 0; j < inhabitants.length; j++) {
                inhabitants[j] /= 2;
            }

        } while (!Arrays.equals(inhabitants, inhab));
        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");
    }
}

//10 5 20 4 0 1 6 4