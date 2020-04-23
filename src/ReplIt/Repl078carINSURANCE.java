package ReplIt;

import java.util.Scanner;

public class Repl078carINSURANCE {
    public static void main(String[] args) {
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");

        System.out.println("Enter your name");
        name = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String YesNo = scan.nextLine();
        int zipcode =0;
        if (YesNo.equalsIgnoreCase("yes")){
            System.out.println("Enter your zip code");
            zipcode = scan.nextInt();
        }else {
            System.out.println("Invalid data!");
            System.exit(0);
        }
        /*
        If zip code equals to  20910 or 20740, add $60 to the premium
        (an amount to be paid for an insurance policy).
        If zip code equals to  22102 or 22103, add $30 to the premium.
         Otherwise add $50 to the premium.
         */
        if (zipcode==20910||zipcode==20740){
            premium+=60;
        }else if (zipcode==22102||zipcode==22103){
            premium+=30;
        }else {
            premium+=50;
        }
        // If car is owned, add $10 to the premium,  otherwise add $20 to the premium.
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.nextLine();
        if (vehicleOwnership.equalsIgnoreCase("owned")){
            premium+=10;
        }else{
            premium+=20;
        }
        /*
         If car used for Business, add $50 to the premium. If car for
         Pleasure add $10 to the premium. If car is for  Commute - add $20 to the premium,
         */
        String n = scan.nextLine();
        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.nextLine();
        if (vehicleUsage.equalsIgnoreCase("Business")){
            premium+=50;
        }else if (vehicleUsage.equalsIgnoreCase("Pleasure")){
            premium+=10;
        }else if (vehicleUsage.equalsIgnoreCase("Commute")){
            premium+=20;
        System.out.println("Days Driven To Work And/Or School");
        daysDrivenToWorkOrSchool = scan.nextInt();
       premium+=daysDrivenToWorkOrSchool*5;

        System.out.println("Miles Driven To Work And/Or School");
        milesToWorkOrSchool = scan.nextInt();
        premium+=milesToWorkOrSchool;
        }
        System.out.println("How old are you?");
        int age = scan.nextInt();
        if (age<16){
            System.out.println("Invalid data!");
            System.exit(0);
        }else if (age>=16&&age<18){
            premium*=20;
        }else if (age>=18&&age<=21){
            premium*=6;
        }else if (age>21&&age<25){
            premium*=2;
        }
        System.out.println("How many years you've been driving?");
        int drivingExperience = scan.nextInt();
        if (drivingExperience<0&&drivingExperience<16){
            System.out.println("Invalid data!");
            System.exit(0);
        }else if (age-drivingExperience>16){
            premium-=5*drivingExperience;
        }
        System.out.println("Have you had any accidents in the last 5 years?");
        String accident = scan.next();
        if (accident.equalsIgnoreCase("yes")){
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();
            premium+=premium*0.2*accidentsAmount;
        }
      //  String S = scan.nextLine();
        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.next();
        if (continuousInsurance.equalsIgnoreCase("no")){
            premium*=2;
        }
        /*
        If level of education equals to "PhD" or "Bachelors"or "Masters" -   reduce premium by 5%.
        If the level of education equals to "Doctors" reduce premium by 10%.
        If level of education equals to "Less than High School" increase premium by 5%.
         */

        System.out.println("What is the highest level of education you have completed?");
        education = scan.next();
        if (education.equalsIgnoreCase("phD")||education.equalsIgnoreCase("Bachelors")
                ||education.equalsIgnoreCase("Masters")){
            premium-=premium*0.05;
        }else if (education.equalsIgnoreCase("Doctors")){
            premium-=premium*0.1;
        }else if (education.equalsIgnoreCase("Less than High School")){
            premium+=premium*0.05;
        }
        System.out.println(name+", here's your quote!");
        System.out.println("Start Your Policy Today For: $"+premium);
        referenceNumber=name.substring(0,2)
                +age+name.substring((name.length()-2),(name.length()))
                +zipcode+education.replace(" ", "");
        System.out.println("Reference number: "+referenceNumber.toUpperCase());

//        Ray
//        Yes
//        20910
//        Owned
//        Business
//        45
//        10
//        Yes
//        1
//        Yes
//        Bachelors
//





    }
}
