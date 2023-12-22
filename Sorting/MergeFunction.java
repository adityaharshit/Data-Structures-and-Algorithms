package Sorting;

import java.util.Arrays;

public class MergeFunction {
    public static void main(String[] args) {
        int[] arr = {1,2,3,10,11,12,13,5,6,7,8,9,14,15,16};
        mergeFunction(arr,3,6,11);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeFunction(int[] arr, int low, int mid, int high){
        int index=low,len=high-low+1;
        int[] sorted = new int[len];
        int lim = mid;
        mid++;
        int count=0;
        while(low<=lim && mid<=high){
            if(arr[low]<=arr[mid]){
                sorted[count]=arr[low];
                low++;
                count++;
            }else{
                sorted[count] = arr[mid];
                mid++;
                count++;
            }
        }
        while(low<=lim){
            sorted[count] = arr[low];
            count++;
            low++;
        }
        while(mid<=high){
            sorted[count] = arr[mid];
            count++;
            mid++;
        }
        for(int i=0;i<len;i++){
            arr[index] = sorted[i];
            index++;
        }
    }
}
