package ReplIt;
//this is today last repl ,,,i'm so tired but feel great after all!!!
public class Repl_155fibnoci {
    public static void fib(int num){
        //WRITE YOUR CODE HERE
       int f[] = new int[num+2];
       f[0]=0;
       f[1]=1;
       for (int i=2;i<=num;i++){
           f[i]=f[i-1]+f[i-2];
       }
        System.out.println(f[num]);
    }

    public static void main(String[] args) {
        fib(9);
    }
}
