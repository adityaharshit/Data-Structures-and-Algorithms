package Sorting;

import java.util.Arrays;

public class CountingSort {
    static void countingSort(int[] arr, int k){
        int[] occur = new int[k];
        for(int num:arr){
            occur[num]++;
        }
        for(int i=1;i<k;i++){
            occur[i] = occur[i-1]+occur[i];
        }
        int[] output = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            output[occur[arr[i]]-1] = arr[i];
            occur[arr[i]]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,2,6,3,4,5};
        countingSort(arr, 7);
        System.out.println(Arrays.toString(arr));
    }
}
