package ReplIt;

public class Repl_169 {
    public static int wordCount(String words) {
        String word[] = words.split(" ");
        int count = word.length;
        return count;

    }

    public static void main(String[] args) {
        System.out.println(wordCount("my name is bahtiyar muhsin"));
    }
}
