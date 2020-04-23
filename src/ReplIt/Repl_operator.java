package ReplIt;
/*
using the giving x and y int variables, use operators to do math operations with the two
variables. output the math operation results in this order:
plus,minus,multiply(*),divide(/) and modulo(%)

use System.out.println to output the results.
 */
public class Repl_operator {
    public static void main(String[] args) {
        int x=10;
        int y = 2;

        //your code
        int results1 = (x+y);
        int results2=(x-y);
        int results3=(x*y);
        int results4=(x%y);
        System.out.println(results1);
        System.out.println(results2);
        System.out.println(results3);
        System.out.println(results4);
    }
}
