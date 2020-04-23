package ReplIt;
/*
Write an expression using the conditional operator (? :)
that compares the value of the variable x to 5 and results in:
Display x if x is greater than or equal to 5
Display -x if x is less than 5

DO NOT USE IF STATEMENT or SWITCH CASE
 */
public class Repl52 {
    public static void main(String[] args) {
       int x = 6;

       x = (x>=5)?x:-x;
        System.out.println(x);

    }
}
