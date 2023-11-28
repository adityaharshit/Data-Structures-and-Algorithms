//Given an array arr[] of integers, find out the maximum difference between any two elements such that the larger element appears after the smaller number. 
package Arrays;

public class MaxDiff {
    public static void main(String[] args) {
        int[] arr={30,10,8,4};
        System.out.println(maxDiff(arr));
    }  
    static int maxDiff(int[] arr){
        int res= arr[1]-arr[0];
        int minVal = arr[0];
        for(int i=1;i<arr.length;i++){
            res = Math.max(res, arr[i]-minVal);
            minVal = Math.min(minVal, arr[i]);
        }
        return res;
    }
}
