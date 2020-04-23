package BahitJava;

public class test15 {
    public static void main(String[] args) {
        /*
        an automated test also needs a way to grade students.

in this assignment you will get a grade int and using ifs output if its a passing grade or failure.

if grade is bigger then 90 output "excellent"

if the grade is bigger then 70 and smaller then 90 output "good"

if grade is bigger then 60 and smaller then 70 output "pass"

if grade is smaller then 60 output "fail"

hint: && is the operator for and in java.
         */
        int grade = 55;
        if (grade>90){
            System.out.println("excellent");
        }
        if (grade>70&&grade<90){
            System.out.println("good");
        }
        if (grade>60&&grade<70) {
            System.out.println("pass");
        }
        if (grade<60){
            System.out.println("fail");
        }
    }
}
