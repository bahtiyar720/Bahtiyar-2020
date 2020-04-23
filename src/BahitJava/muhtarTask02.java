package BahitJava;
/*
creata a function that can print the minimum number from any given array
 */
public class muhtarTask02 {
    public static void minimumNum(int arr[]){
        int min = arr[0];
        for (int i = 1; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int nums[] = {34, 45, 78, 90, 23, 12, 100};
        minimumNum(nums);
    }
}
