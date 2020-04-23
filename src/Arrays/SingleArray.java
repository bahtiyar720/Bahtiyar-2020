package Arrays;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class SingleArray {
    public static void main(String[] args) {
        System.out.println("Please, enter a name");
        Scanner input = new Scanner(System.in);
        String student[] = new String[10];
        for (int i = 0 ; i<student.length;i++){
            student[i]=input.nextLine();

        }
        System.out.println(Arrays.toString(student));




            }

        }




