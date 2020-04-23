package ReplIt;

import java.util.Scanner;
/*
1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
 */

public class Repl064 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String wordx ="";
        if (word.length()%2!=0){
            wordx=word.substring(word.length()/2,word.length()/2+1);
        }if (word.length()==1){
            wordx=word+word+word;
        }
        if (word.length()%2==0){
            wordx=word.substring((word.length()/2)-1,(word.length()/2)+1);
        }if (word.length()==2){
            wordx=word+word;
        }


        System.out.println(wordx);



    }
}
