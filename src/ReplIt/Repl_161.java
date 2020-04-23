package ReplIt;

/*
the regular calculation under 50 is
bill = units * 0.60;
above 50 is:
bill = units * 0.90;
 */
public class Repl_161 {
    public static double waterTax(double units) {
        double bill = 0.0;

        //your code here
        if (units <= 50) {
            bill += units * 0.60;

        } else if (units > 50&&units<=100) {
            bill += units * 0.90;
        } else if (units > 100&&units<=150) {
            bill +=units * 0.90+50;
        } else if (units > 150) {
            bill += units * 0.90+100;
        }
        return bill;

    }

    public static void main(String[] args) {
        double watertx = waterTax(101);
        System.out.println(watertx);
    }
}
