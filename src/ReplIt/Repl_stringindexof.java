package ReplIt;

public class Repl_stringindexof {
    public static void main(String[] args) {
        String txt = "foo bar";
        System.out.println(txt.indexOf('b'));
        System.out.print(txt.indexOf('f'));
        System.out.print(txt.indexOf('o'));
        System.out.print(txt.lastIndexOf('o'));
    }
}
