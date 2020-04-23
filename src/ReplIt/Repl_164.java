package ReplIt;

public class Repl_164 {
    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {

       if (isAvailable==true&&month<=12&&month>=8&&year==2018){
           return true;
       }else if (isAvailable==false&&month<=12&&month>=8&&year==2018){
           return false;
       }else if (isAvailable==true&&month<=6&&month>=1&&year==2018){
           return true;
       }else if (isAvailable==false&&month<=12&&month>=8&&year==2018){
           return false;
       }else if (isAvailable==true&&month==7&&day>8&&year==2018){
           return true;
       } else {
           return false;
       }
    }

    public static void main(String[] args) {
        System.out.println(simpleRoomBook(true,7,8,2018));
    }
}
