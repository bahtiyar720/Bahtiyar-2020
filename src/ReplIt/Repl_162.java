package ReplIt;

public class Repl_162 {
    public static boolean threeLocks(boolean a, boolean b, boolean c) {

       if (a&&b){
           return true;
       }else if (c){
           return true;
       }else {
           return false;
       }


    }

    public static void main(String[] args) {
        boolean result = threeLocks(true,true,true);
        System.out.println(result);
    }
}
