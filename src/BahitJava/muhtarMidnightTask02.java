package BahitJava;

import java.util.Scanner;

public class muhtarMidnightTask02 {
    //write a method called GalonsToLitters, that can convert gallons to litters
    // 1 G = 3.75 L

        public static void GalonsToLitters() {
            Scanner sc = new Scanner(System.in);
            double gl = sc.nextDouble();
            gl *= 3.785;
            String k = String.format("%.2f", gl);
            System.out.println("Giving number of Galon is: " + k + " Litter");

        }

        public static void main(String[] args) {
         GalonsToLitters();
        }
    }

