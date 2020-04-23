package ReplIt;

import java.util.Scanner;

public class Repl_145 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }//end main

    public static void plus_minus(int[]arr){
        int countpsitive = 0;
        int countnegivtive = 0;
        int countzero = 0;

        for (int each:arr){
            if (each>0){
                countpsitive++;
            }else if (each<0){
                countnegivtive++;
            }else if (each==0){
                countzero++;
            }
        }
        System.out.println("positives:"+countpsitive+", negatives:"+countnegivtive+", zeros:"+countzero);
    }
}
