package ReplIt;

public class Repl_assesment {
    public static void main(String[] args) {
        /*
        Write a  for loop that prints the odd integers 11 through 121 inclusive, separated by spaces.
         */

        for (int i = 10; i<=121; i++){
            System.out.print((i+=1)+" ");
            continue;
        }
    }
}
