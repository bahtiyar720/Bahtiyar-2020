package BahitJava;

public class test11 {
    public static void main(String[] args) {
        int a = 50;
        a = --a + a++ + a-- + a++;
        // --50 + 50++ + 50-- + 50++
        //===========================
        //  49 + 49 + 49 + 50=197
          System.out.println(a);

    }
}
