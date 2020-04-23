package ReplIt;

public class Repl_158 {
    public static boolean isEven(int n){
        if (n%2==0){
            return (true);
        }else {
            return (false);
        }

    }

    public static void main(String[] args) {
        boolean result = isEven(3);
        System.out.println(result);
    }
}
