package Sorting;

import java.util.Arrays;

public class MinimumDifference {
    public static void main(String[] args) {
        int[] arr = {3,8,5,0,-1};
        System.out.println(calcDiff(arr));
    }
    static int calcDiff(int[] arr){
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            res = Math.min(res, arr[i]-arr[i-1]);
        }
        return res;
    }
}
