package Sorting;

import java.util.Arrays;

public class SortTwoTypes {
    public static void main(String[] args) {
        int[] arr = {15,-3,-2,-8};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortArr(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count++] = temp;
            }
        }
    }
}
