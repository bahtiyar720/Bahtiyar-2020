package ReplIt;
import java.util.Arrays;
import java.util.Scanner;

public class Repl_zombieTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        int[]  inhabFinal = new int[8];
        int day=0;
        do {
            System.out.println("Day "+ day+" " + Arrays.toString(inhabitants)  );
            day++;
            for (int i = 0; i < inhabitants.length; i++)  {
                inhabitants[i] = inhabitants[i] / 2;
            }
        }while (!Arrays.equals(inhabitants,inhabFinal));
        System.out.println("Day "+ day+" " + Arrays.toString(inhabitants)  );
        System.out.println("---- EXTINCT ----");

    }
}
//10 5 20 4 0 1 6 4
