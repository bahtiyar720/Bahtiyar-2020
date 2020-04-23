package ReplIt;

public class Repl_156 {
    public static int  count_appearance(String[] arr, String t)
    {
        int count = 0;
        for (int i = 0; i <arr.length;i++){
            if (arr[i].equals(t)){
                count++;
            }

        }return count;

    }

    public static void main(String[] args) {
        String arr []={"ab","bahhit","nohta","top","tipish","nohta"};
       int result = count_appearance(arr,"nohta");
        System.out.println(result);

    }
}
