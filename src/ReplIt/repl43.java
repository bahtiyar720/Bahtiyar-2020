package ReplIt;
/*
Write a program that will return mid number out of three numbers.  No need to do any calculations.


Example 1:
Display prompt: "Enter first number:"
14
Display prompt: "Enter second number:"
52
Display prompt: "Enter third number:"
25
Display prompt: "Medium value is: 25"

Example 2:
Display prompt: "Enter first number:"
140
Display prompt: "Enter second number:"
34
Display prompt: "Enter third number:"
1
Display prompt: "Medium value is: 34"
 */
public class repl43 {
    public static void main(String[] args) {
        int num1 = 29;
        int num2 = 30;
        int num3 = 31;
        //Medium value is: 34
        if (num1>num2&&num1<num3){
            System.out.println("Medium value is: "+num1);
        }
        if (num2>num1&&num2<num3){
            System.out.println("Medium value is: "+num2);
        }
        if (num3>num1&&num3<num2){
            System.out.println("Medium value is: "+num3);
        }

    }
}
