package ReplIt;
/*
Write an expression using the conditional operator (? :) that compares the values of the variables num1 and num2.
The result (that is the value) of this expression should be the value of the larger of the two variables.  Larger value should be printed out.
 */
public class Repl53 {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 4;
        int x = (num1>num2)?num1:num2;
        System.out.println(x);


    }
}
