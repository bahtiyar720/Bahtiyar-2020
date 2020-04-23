package BahitJava;

import java.util.Arrays;

/*
create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]  //90 76  89  908976
 */
public class muhtarTask03 {
    public static void arrDecend(int arr[]) {
        int lenth = arr.length-1; //6
        int newarr[] = new int[arr.length];// newarr[7]  -->[0] ..[6]
                         //6
        for (int i = arr.length-1;i>=0;i--){
             newarr[lenth-i]=arr[i];   //[1]
        }
        System.out.println(Arrays.toString(newarr));
    }

    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40, 50, 60, 70};   //[0]...[6]
        arrDecend(nums);
    }
}
