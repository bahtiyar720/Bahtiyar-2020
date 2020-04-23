package ReplIt;

public class Repl_153 {
    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE
        for (String each1:words){
            int count = 0;
            for (String each2:words){
                if (each1.equals(each2)){
                    count++;
                }
            }if (count==1){
                System.out.println(each1);
            }
        }

    }
}
