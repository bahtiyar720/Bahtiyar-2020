package Warmup;

import java.lang.reflect.Array;

public class task03 {
    public static void main(String[] args) {

        /*
        2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         */

        String [] month = new String[13];
        month[0] = "null";
        month[1] = "31 days";
        month[2] = "28 days";
        month[3] = "31 days";
        month[4] = "30 days";
        month[5] = "31 days";
        month[6] = "30 days";
        month[7] = "31 days";
        month[8] = "31 days";
        month[9] = "30 days";
        month[10] = "31 days";
        month[11] = "30 days";
        month[12] = "31 days";
        System.out.println(month[5]);
    }
}
