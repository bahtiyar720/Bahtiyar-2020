package ReplIt;

import java.util.Scanner;

public class Repl_109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        for (int k= 0; k<arr.length;k++){
            System.out.println(arr[k].substring(0,3));
        }
    }
}
