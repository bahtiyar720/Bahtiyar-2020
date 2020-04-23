package ReplIt;

public class Repl_154 {
    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        String reverse = "";
        String number = Integer.toString(num);
        for (int i = number.length()-1;i>=0;i--){
            reverse += ""+number.charAt(i);
        }if (reverse.equals(number)){
            System.out.println(true);
        }else System.out.println(false);

    }

    public static void main(String[] args) {
        isPalindrome(1234);
    }
}
