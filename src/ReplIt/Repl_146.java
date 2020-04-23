package ReplIt;

import java.util.Scanner;

public class Repl_146 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info)
    {

        //your code here
        String arr[]=info.split(",");
        //{"person name","last name","age"}
        System.out.println("person name: "+arr[0]+" last name: "+arr[1]+" age: "+arr[2]);

//person name: jon last name: doe age: 30
    }//end person
}
