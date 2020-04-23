package ReplIt;

public class Repl48 {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 5;
        int n3 = 7;
        if (n1>n2&&n1>n3&&n1!=n2&&n1!=n3){
            System.out.println("n1 is bigger");
        }
        if (n2>n1&&n2>n3&&n2!=n1&&n2!=n3){
            System.out.println("n2 is bigger");
        }
        if (n3>n2&&n3>n1&&n3!=n2&&n3!=n1){
            System.out.println("n3 is bigger");
        }
    }
}
