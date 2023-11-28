//Given an array of integers of size 'n'. Our aim is to calculate the maximum sum of 'k' consecutive elements in the array.

package Arrays;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {-5,-10,-6,-90,-3};
        System.out.println(slidingWindow(arr, 1));
    }
    static int slidingWindow(int[] arr,int k){
        int left= 0,right=0,window=1,sum=0,res=arr[0];
        while(right<arr.length){
            window=right-left+1;
            sum+=arr[right];
            if(window==k){
                res = Math.max(res, sum);
                sum-=arr[left];
                left++;
            }
            right++;
        }
        return res;
    }
}
