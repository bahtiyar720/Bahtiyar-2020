package ReplIt;

public class Repl_157 {
    public static int max(int x,int  y){
       if (x>y){
           return y;
       }else {
           return x;
       }
    }

    public static void main(String[] args) {
        int min =max(100,20);
        System.out.println(min);

    }
}
