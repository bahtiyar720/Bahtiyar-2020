package ReplIt;

import java.util.Scanner;

public class Repl_141 {
    public static void cube()
    {
        //your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num=num*num*num;
        System.out.println(num);

    }//end cube

    public static void main(String[] args) {

        cube();

    }
}
