package ReplIt;

public class Repl_160 {
    public static boolean hamletQuote(boolean toBe,boolean notToBe){
          if (toBe==true&&notToBe==false){
              return true;
          }else if (toBe==false&&notToBe==true){
              return true;
          }else if (toBe==true&&notToBe==true){
              return true;
          }else {
              return false;
          }

    }

    public static void main(String[] args) {
       boolean result= hamletQuote(true,false);
        System.out.println(result);
    }
}
