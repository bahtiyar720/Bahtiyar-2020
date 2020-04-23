package BahitJava;

public class warmUp_frequencyofCHAR {
    public static String frequency(String str) {

        String nonDup = "";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += str.charAt(i);
            }
        }
        for (int j = 0; j < nonDup.length(); j++) {
            char ch = nonDup.charAt(j);
            int count = 0;
            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(k) == ch) {
                    count++;
                }
            }
            result += "" + ch + count;
        }
        return result;
    }

    public static void main(String[] args) {
        String result = frequency("AAABCCCDD");
        System.out.println(result);
    }
}
