package Sorting;

import java.util.*;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] arr = {{7,9},{6,10},{4,5}, {1,3}, {2,4}};
        int[][] res = mergeIntervals(arr);
        System.out.println(Arrays.deepToString(res));
    }
    static int[][] mergeIntervals(int[][] arr){
        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
        int res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[res][1]>=arr[i][0]){
                arr[res][0] = Math.min(arr[res][0], arr[i][0]);
                arr[res][1] = Math.max(arr[res][1], arr[i][1]);
            }else{
                res++;
                arr[res][0] = arr[i][0];
                arr[res][1] =arr[i][1];
            }
        }
        int[][] result = new int[res+1][2];
        for(int i=0;i<=res;i++){
            result[i][0] = arr[i][0];
            result[i][1] = arr[i][1];
        }
        return result;
    }
}
