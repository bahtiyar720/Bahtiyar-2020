package ReplIt;

public class Repl_166 {
    public static String mergeStrings(String one, String two) {

        String c = "";

        for (int i = 0; i < one.length() || i < two.length(); i++) {
            if (i < one.length()) {
                c += one.charAt(i);
            }
            if (i < two.length()) {
                c += two.charAt(i);
            }
        }

        return c;

    }

    public static void main(String[] args) {
        System.out.println(mergeStrings("java", "selenium"));


    }
}
