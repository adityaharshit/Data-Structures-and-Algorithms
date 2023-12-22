package Sorting;

import java.util.*;
import java.util.ArrayList;
public class BucketSort {
    public static void main(String[] args) {
        int[] arr = {70,80,45,68,20,34,89,99,8,23,5,3};
        bucketSort(arr, 5);
        System.out.println(Arrays.toString(arr));
    }
    static void bucketSort(int[] arr, int k){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int max =0;
        for(int num:arr){
            max = Math.max(max, num);
        }
        max++;
        for(int i=0;i<k;i++){
            list.add(new ArrayList<>());
        }
        int div = max/k;
        for(int num:arr){
            int index = num/div;
            list.get(index).add(num);
        }
        for(int i=0;i<k;i++){
            Collections.sort(list.get(i));
        }
        int index=0;
        for(int i=0;i<k;i++){
            for(int j=0;j<list.get(i).size();j++){
                arr[index++] = list.get(i).get(j);
            }
        }
    }
}
