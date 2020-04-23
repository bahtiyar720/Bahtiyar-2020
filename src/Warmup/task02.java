package Warmup;

public class task02 {
    public static void main(String[] args) {
        /*
        declare 3 numbers n1, n2, n3
            if n1 and n2 are equal  => n1&n2 are equal

            if n2 and n3 are equal ==> n2&n3 are equal
            if n3 and n1 are qual ==>n3&n1 are equal
            if all equal ==> all equal
            if none of them are euqal ==> none of them are equal

         */
        double num1 = 1;
        double num2 = 1;
        double num3 = 3;
        if (num1==num2&&num1!=num3){
            System.out.println(num1+"&"+num2+" are equal");
        }
        if (num2==num3&&num2!=num1){
            System.out.println(num2+"&"+num3+" are equal");
        }
        if (num3==num1&&num3!=num2){
            System.out.println(num2+"&"+num3+" are equal");
        }
        if (num1==num2&&num1==num3&&num2==num3){
            System.out.println("all equal");
        }
        if(num1!=num2&&num1!=num3&&num2!=num3){
            System.out.println("none of them are equal");
        }


    }
}
