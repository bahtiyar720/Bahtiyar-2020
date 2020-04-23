package BahitJava;

import java.util.Scanner;

/*
 write a method called KmToMiles that can convert km to miles
	 				1 km = 0.612 miles
 */
public class muhtarMidnightTsk01 {
    public static void KmToMiles(){
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
         km /= 1.609;
        String k = String.format("%.2f", km);
        System.out.println("Giving number kilometer is: "+k+" miles");

    }

    public static void main(String[] args) {
        KmToMiles();
    }
}
