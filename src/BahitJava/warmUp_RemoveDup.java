package BahitJava;

public class warmUp_RemoveDup {
    public static String removeDup(String word) {
        int count = 0;
        String nonDup = "";
        for (int i = 0; i < word.length(); i++) {
            if (!nonDup.contains("" + word.charAt(i))) {
                nonDup += word.charAt(i);
            }

        }
        return nonDup;
    }

    public static void main(String[] args) {
        String result = removeDup("aavvccdde");
        System.out.println(result);
    }
}
