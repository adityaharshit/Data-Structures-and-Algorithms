//Given a circular array of size n, find the maximum subarray sum of the non-empty subarray.
package Arrays;

public class MaxSumCircular {
    public static void main(String[] args) {
        
    }
    public int kadaneAlgo(int[] nums){
        int sum=0,max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max = Math.max(sum,max);
            if(sum<=0){
                sum=0;
            }
        }
        return max;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int sum1 = kadaneAlgo(nums);
        if(sum1<0){
            return sum1;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i] = -nums[i];
        }
        int sum2 = sum+kadaneAlgo(nums);
        System.gc();
        return Math.max(sum1,sum2);
    }
}
