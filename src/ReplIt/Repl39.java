package ReplIt;

public class Repl39 {
    public static void main(String[] args) {
        /*
        U have an Integer number already declared and assigned value.
       Using conditional statements, check if number is odd or even. Please
        follow the below examples and print message accordingly:
         Enter a number:
          10
           10 is even
           Enter a number:
           33
          33 is odd
           Enter a number:
           0
           0 is even
         */
        int number = 0;
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
