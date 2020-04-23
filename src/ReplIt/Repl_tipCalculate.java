package ReplIt;

import java.util.Scanner;

public class Repl_tipCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Split:");
        String split = scanner.nextLine();
        System.out.println("Number of people:");
        int numberofpeople = scanner.nextInt();
        System.out.println("Check amount:");
        double checkamount = scanner.nextDouble();
        System.out.println("Service Quality:");
        String serviceQ = scanner.next();

        double totaltip = 0;
        switch (numberofpeople){
            case 1:
                System.out.println("Number of people entered: "+"&");
                break;
            case 2:
                System.out.println("Number of people entered: "+"&&");
                break;
            case 3:
                System.out.println("Number of people entered: "+"&&&");
                break;
            case 4:
                System.out.println("Number of people entered: "+"&&&&");
                break;
            case 5:
                System.out.println("Number of people entered: "+"&&&&&");
            default:
                System.out.println();
        }

        if (serviceQ.equalsIgnoreCase("poor")){
            totaltip=checkamount*0.05;
        } if (serviceQ.equalsIgnoreCase("fair")){
            totaltip=checkamount*0.1;
        } if (serviceQ.equalsIgnoreCase("good")){
            totaltip=checkamount*0.15;
        } if (serviceQ.equalsIgnoreCase("great")){
            totaltip=checkamount*0.2;
        } if (serviceQ.equalsIgnoreCase("excellent")){
            totaltip=checkamount*0.25;
        }
        System.out.println("Total to pay: " + (checkamount+totaltip));//595
        System.out.println("Total tip: " + totaltip);//119
        System.out.println("Total per person: "+(checkamount+totaltip)/numberofpeople);
        System.out.println("Tip per person: "+totaltip/numberofpeople);


    }
}
