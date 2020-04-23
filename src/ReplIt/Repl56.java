package ReplIt;

import java.util.Scanner;

public class Repl56 {
    public static void main(String[] args) {
        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Select screen size:");
        double screensize = scan.nextDouble();
        if (screensize==13.3){
            price+=200;
        }else if (screensize==15.0){
            price+=300;
        }else if (screensize==17.3){
            price+=400;
        }
        System.out.println("Select CPU type:");
        cpu = scan.next();
        if (cpu.equalsIgnoreCase("i3")){
            price+=150;
        }else if (cpu.equalsIgnoreCase("i5")){
            price+=250;
        }else if (cpu.equalsIgnoreCase("i7")){
            price+=350;
        }

        System.out.println("Select RAM size:");
        ram = scan.nextInt();
        price += ram*12.5;
        System.out.println("Select storage type:");
        storageType = scan.next();
        if (storageType.equalsIgnoreCase("ssd")||storageType.equalsIgnoreCase("hdd")){
            System.out.println("Enter memory size:");
            int memorysize = scan.nextInt();
            if (storageType.equalsIgnoreCase("hdd")){
                price+=memorysize*0.1;
            }else if (storageType.equalsIgnoreCase("ssd"))
             price+=memorysize*0.2;
        }
        System.out.println("Enter screen resolution:");
        screenType = scan.next();
        if (screenType.equalsIgnoreCase("FULLHD")){
            price+=100;
        }else if (screenType.equalsIgnoreCase("4k")){
            price+=200;
        }
        System.out.println("Laptop price is: $"+price);

    }
}
