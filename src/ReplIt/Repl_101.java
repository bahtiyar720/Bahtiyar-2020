package ReplIt;

import java.util.Scanner;

public class Repl_101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        for (String each:words){
            System.out.println(each.substring(0,1)+""+each.substring(each.length()-1));
        }
    }
}
//hello why by apple note