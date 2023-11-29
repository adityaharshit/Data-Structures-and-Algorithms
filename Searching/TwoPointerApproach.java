//In this particular problem, we are provided with a sorted array of integers. Our objective is to determine whether there exists a pair of integers in the array that adds up to a given target value.

package Searching;

public class TwoPointerApproach {
    public static void main(String[] args) {
        int[] arr= {2,5,8,12,30};
        System.out.println(pairSum(arr,18));
    }
    static boolean pairSum(int[] arr, int target){
        int left =0,right=arr.length-1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum==target){
                return true;
            } else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
}
