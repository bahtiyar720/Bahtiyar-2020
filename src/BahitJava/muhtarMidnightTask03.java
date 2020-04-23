package BahitJava;
/*
write a method called Calculation, that can accepts 3 parameters: 2 numbers and one operator, and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, "*") ==> 20;
 */
public class muhtarMidnightTask03 {
    public static void Calculation(int num1, int num2, String operator){
        int result = 0;
             if (operator.equals("-")) {
                 result += num1 - num2;
             } else if (operator.equals("+")) {
                 result += num1 + num2;
             } else if (operator.equals("*")) {
                 result += num1 * num2;
             } else if (operator.equals("/")) {
                 result += num1 / num2;
             } else if (operator.equals("%")) {
                 result += num1 % num2;
             } else {
                 System.out.println("Invalid Operator");
             }
        System.out.println("your final calculation is: "+result);
         }

    public static void main(String[] args) {
        Calculation(12,34,"*");
    }
}
