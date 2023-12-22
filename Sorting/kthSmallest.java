package Sorting;

import java.util.*;

public class kthSmallest {
    public static void main(String[] args) {
        int[] arr ={5,8,2,6,3,9};
        int k = 5;
        int low=0, high = arr.length-1;
        int res=0;
        while(low<=high){
            res= LomutoPartition.lomutoPartition(arr, low, high);
            if(res==k-1){
                System.out.println(arr[res]);
                break;
            }else if(res>k-1){
                high = res-1;
            }else{
                low = res+1;
            }
        }
    }
}
