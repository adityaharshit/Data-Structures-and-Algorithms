package Sorting;

import java.util.Arrays;

public class SortThreeTypes1 {
    public static void main(String[] args) {   
        int[] arr = {1,0,2,0,2,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,2,2,2,2,2,2};
        sortOne(arr);
        System.out.println(Arrays.toString(arr));
    }
    //Dutch National Flag Algorithm
    static void sortOne(int[] arr){
        int l=0, h=arr.length-1, mid=0;
        while(mid<=h){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid++] = arr[l];
                arr[l++] = temp;
            }else if(arr[mid]==2){
                int temp = arr[mid];
                arr[mid] = arr[h];
                arr[h--] = temp;
            }else{
                mid++;
            }
        }
    }
}
