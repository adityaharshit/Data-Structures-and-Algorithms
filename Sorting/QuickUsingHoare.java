package Sorting;

import java.util.*;

public class QuickUsingHoare {
    public static void main(String[] args) {
        int[] arr = {8,4,7,9,3,10,5};
        quickSortH(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSortH(int[] arr, int l, int h){
        if(l<h){
            int p = HoaresPartition.hoarePartition(arr, l, h);
            quickSortH(arr, l, p);
            quickSortH(arr, p+1, h);
        }
    }
}
