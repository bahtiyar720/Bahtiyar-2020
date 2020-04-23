package ReplIt;

import java.util.Scanner;

public class Repl035 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        switch (item){
            default:
                System.out.println("Invalid item!");
                break;
                case  "Smartphone":
                    System.out.println("Sorry, not enough funds on your gift card!");
                    break;
            case "Laptop":
                System.out.println("Sorry, not enough funds on your gift card!");
                break;
            case "Charger":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: 85$");
                break;
            case "USB cable":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: 90$");
                break;
            case "Headphones":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: 70$");
                break;
            case "Pants":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: 50$");
                break;
            case "Hat":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: 75$");
                break;
            case "Socks":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: 95$");
                break;
            case "Blanket":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: 40$");
                break;
            case "Pillow":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: 60$");

        }
    }
}
