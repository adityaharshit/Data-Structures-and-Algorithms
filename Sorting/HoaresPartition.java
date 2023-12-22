package Sorting;

import java.util.Arrays;

public class HoaresPartition {
    public static void main(String[] args){
        int[] arr = {5,3,8,2,7,1,10};
        int num = hoarePartition(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int hoarePartition(int[] arr, int l, int h){
        int pivot = arr[l];
        int i=l-1, j=h+1;
        while(true){
            do{
                i++;
            } while(arr[i]<pivot);
            do{
                j--;
            } while(arr[j]>pivot);
            if(i>=j) return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
}
