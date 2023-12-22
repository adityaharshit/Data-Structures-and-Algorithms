package Sorting;

import java.util.Arrays;

public class ChocolateDist {
    public static void main(String[] args) {
        int[] arr = {7,4,9,2,3,8,10,12};
        int m=5;
        System.out.println(chocolateDiff(arr,m));
    }
    static int chocolateDiff(int[] arr, int m){
        int res=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-m+1;i++){
            res = Math.min(res, arr[i+m-1]-arr[i]);
        }
        return res;
    }
}
