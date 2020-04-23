package Warmup;

public class task03_03 {
    public static void main(String[] args) {
         /*
        2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         */
         byte month=0;
         boolean days28 = month ==2;
         boolean days30 = month==4||month==6||month==9||month==11;
         boolean days31 = days28==false&&days30==false;
         if (days28){
             System.out.println("it has 28 days");
         }
         if (days30){
             System.out.println("it has 30 days");
         }
         if (days31){
             System.out.println("it has 31 days");
         }

    }
}
