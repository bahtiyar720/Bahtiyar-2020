package ReplIt;

import java.util.Scanner;

public class Repl_115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }
        String longest = "";
      for (int i = 0; i<words.length;i++){
         for (int j= 0;j<i;j++){
             if (words[i].length()>words[j].length()){
                 longest=words[i];
             }
          }
      }
        System.out.println(longest);
    }
}
