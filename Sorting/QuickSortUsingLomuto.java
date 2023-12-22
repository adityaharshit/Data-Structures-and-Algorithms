package Sorting;

import java.util.Arrays;

public class QuickSortUsingLomuto {
    public static void main(String[] args) {
        int[] arr = {10,80,30,90,40,50,70};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int l, int h){
        if(l<h){
            int part = LomutoPartition.lomutoPartition(arr, l, h);
            quickSort(arr, l, part-1);
            quickSort(arr, part+1, h);
        }
    }
}
