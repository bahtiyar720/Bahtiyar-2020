package BahitJava;
/*
using an if statement check which int is larger a or b, and then output:
"number is greater".

for example:
a=1

b=2

output:
2 is greater

a=5
b=7

output:
7 is greater
 */
public class test07 {
    public static void main(String[] args) {
        int a = 5, b=7;
        if (a<b) {
            System.out.println(b+" is greater");
        }
        if(a>b){
            System.out.println(a+" is greater");
        }



    }
}
