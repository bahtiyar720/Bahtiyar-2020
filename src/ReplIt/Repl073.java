package ReplIt;

import java.util.Scanner;

/*
Example:
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
 */
public class Repl073 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstname = "";
        String lastname = "";
        String domain = "";
        String toplevelmoain = "";
        firstname = email.substring(0, 1).toUpperCase()+email.substring(1,email.indexOf('_'));
        lastname = email.substring(email.indexOf('_')+1,email.indexOf('_')+2).toUpperCase()
                +email.substring(email.indexOf('_')+2,email.indexOf('@'));
        domain = email.substring(email.indexOf('@')+1,email.indexOf('.'));
        toplevelmoain = email.substring(email.indexOf('.')+1);
        System.out.println("First name: "+firstname);
        System.out.println("Last name: "+lastname);
        System.out.println("Domain: "+domain);
        System.out.println("Top-Level Domain: "+toplevelmoain);
        //bahtiyar_muhsin@gmail.com

    }
}
