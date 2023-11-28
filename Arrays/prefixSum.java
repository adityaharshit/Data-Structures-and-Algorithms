//Given an array arr[] of size n, its prefix sum array is another array prefixSum[ ] of the same size, such that the value of prefixSum[i] is arr[0] + arr[1] + arr[2] … arr[i]. 
package Arrays;

public class prefixSum {
    public static void main(String[] args) {
        int[] arr = {2,8,3,9,6,5,4};
        prefix(arr);
        System.out.println(getSum(2,6,arr));
    }
    static int getSum(int start, int end, int[] arr){
        if(start==0)
            return arr[end];
        else return arr[end]-arr[start-1];
    }
    static void prefix(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i-1]+arr[i];
        }
    }
}
