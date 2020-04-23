package ReplIt;

import java.util.Scanner;
/*
Example:
input: breadjambread
output: jam

Example:
input: xxbreadjambreadyy
output: jam
 */
public class Repl_095 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;
        for (int i =0; i<str.length()-4;i++){
            if (str.substring(i,i+5).equals("bread")){
                count++;
            }
        }if (count<=1){

            System.out.println("nothing");
        }else {
            String result = str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
            System.out.println(result);
        }

    }
}


