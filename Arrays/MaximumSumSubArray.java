//Given an array arr[], the task is to find the elements of a contiguous subarray of numbers that has the largest sum.

package Arrays;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] arr = {5,8,3};
        System.out.println(maxSum(arr));
    }
    static int maxSum(int[] arr){
        int res=Integer.MIN_VALUE;
        int sum=0;
        for(int num:arr){
            sum+=num;
            res = Math.max(res,sum);
            if(sum<=0) sum=0;
        }
        return res;
    }
}
