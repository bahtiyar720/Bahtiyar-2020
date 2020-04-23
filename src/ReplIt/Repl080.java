package ReplIt;

import java.util.Scanner;
/*
Online Book Merchants offers premium customers 1 free book with every
purchase of 5 or more books and offers 2 free books with every purchase
of 8 or more books. It offers regular customers 1 free book with every purchase
of 7 or more books, and offers 2 free books with every purchase of 12 or more books.
 */

public class Repl080 {
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();

        if (isPremiumCustomer) {
            if (nbooksPurchased >= 5) {
                freeBooks++;
                if (isPremiumCustomer) {
                    if (nbooksPurchased >= 8) {
                        freeBooks = 2;
                    }
                }

            }
        }if (!isPremiumCustomer){
            if (nbooksPurchased>=7){
                freeBooks++;
            }
        }if (!isPremiumCustomer){
            if (nbooksPurchased>=12){
                freeBooks=2;
            }
        }
        System.out.println(freeBooks);

    }

}



