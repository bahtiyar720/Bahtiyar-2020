package BahitJava;
/*
       creata a function that can print the maximum number from any given array
	5. creata a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
 */

public class muhtartask {
    public static void maxNumber(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int nums[] = {34, 45, 78, 90, 23, 12, 100};
        maxNumber(nums);
    }

}
