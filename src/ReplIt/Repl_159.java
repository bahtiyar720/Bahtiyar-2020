package ReplIt;

public class Repl_159 {
    public static String c_profits (int buyPrice,int sellPrice) {
        //your code here
        String result = "";
        if (buyPrice > sellPrice) {
            result+= "loss";
        } else if (buyPrice < sellPrice) {
            result+= "profit";
        } else if (buyPrice == sellPrice) {
            result+= "no loss";
        }
        return result;
    }

    public static void main(String[] args) {

        String resultprofit = c_profits(10,100);
        String resultloss = c_profits(100,50);
        String resultnoloss = c_profits(100,100);
        System.out.println(resultprofit);
        System.out.println(resultnoloss);
        System.out.println(resultloss);
    }
}
