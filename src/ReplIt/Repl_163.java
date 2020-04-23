package ReplIt;

public class Repl_163 {
    public static boolean validateTask(boolean notEmpty, int taskId, int currentId) {
        if (notEmpty == true && taskId == currentId + 1) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(validateTask(true,3,2));
    }
}
