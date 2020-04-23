package BahitJava;

public class test16 {
    public static void main(String[] args) {
        int house = 21;
        int player = 10;

        if (house+player>21){
            System.out.println("bust");
        }
        if (house>player){
            System.out.println("player loss");
        }
        if (house==player){
            System.out.println("its a tie");
        }
        if (house<player){
            System.out.println("player wins");
        }
    }
}
