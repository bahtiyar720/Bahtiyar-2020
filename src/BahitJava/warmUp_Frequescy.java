package BahitJava;

public class warmUp_Frequescy {
    public static int frequency(String str1, String ch) {
        int countstr2 = 0;
        String nonDup = "";
        for (int i = 0; i < str1.length(); i++) {
            if (("" + str1.charAt(i)).equals(ch)) {
                countstr2++;
            }
        }
        return countstr2;
    }

    public static void main(String[] args) {
        int result = frequency("aabbccdddd", "d");
        System.out.println(result);
    }
}
