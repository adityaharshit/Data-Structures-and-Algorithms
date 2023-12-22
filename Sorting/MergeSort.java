package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr= {5,10,30,15,7};
        mergeSort(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr, int low, int high){
        if(low<high){
            int mid = low+(high-low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            MergeFunction.mergeFunction(arr, low, mid, high);
        }
    }
}
