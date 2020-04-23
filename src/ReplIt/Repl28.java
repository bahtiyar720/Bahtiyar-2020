package ReplIt;
/*
In this assignment, you need to do couple of things:
Write an if statement that will print day of the week based on value of the day variable.


For example:

if day = 1, then print "It's a Monday!"
or, if day = 5, then print "It's a Friday!"

Otherwise (else), print "There is no such a day!"

#################################################

input: 1
output: It's a Monday!

input: 7
output: It's a Sunday!
 */
public class Repl28 {
    public static void main(String[] args) {
        int day = 3;
        String result = "";
        if (day==1){
            //result = "It's a Monday!";
            System.out.println("It's a Monday!");
        }
        else if (day==2){
            //result = "It's a Tuesday!";
            System.out.println("It's a Tuesday!");
        }
        else if (day==3){
            //result = "It's a Wednesday!";
            System.out.println("It's a Wednesday!");
        }
        else if (day==4){
            //result = "It's a Thursday!";
            System.out.println("It's a Thursday!");
        }
        else if (day==5){
            //result = "It's a Friday!";
            System.out.println("It's a Friday!");
        }
        else if (day==6){
            //result = "It's a Saturday!";
            System.out.println("It's a Saturday!");
        }
        else if (day==7){
            //result = "It's a Sunday!";
            System.out.println("It's a Sunday!");

        }else {
            //result ="There is no such a day!";
            System.out.println("There is no such a day!");
        }
        System.out.println(result);
        // i commend out my method because it wont work in repl it!!!!!!
    }
}
