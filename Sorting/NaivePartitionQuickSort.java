package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class NaivePartitionQuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, 12, 10, 7};
        naivePartition(arr, 6);
        System.out.println(Arrays.toString(arr));
    }
    static void naivePartition(int[] arr, int index){
        int val = arr[index];
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i==index) continue;
            int num = arr[i];
            if(num<=val)
                left.add(num);
            else
                right.add(num);
        }
        int count=0;
        for(int i=0;i<left.size();i++){
            arr[count]=left.get(i);
            count++;
        }
        arr[count] = val;
        count++;
        for(int i=0;i<right.size();i++){
            arr[count]=right.get(i);
            count++;
        }
    }
}
