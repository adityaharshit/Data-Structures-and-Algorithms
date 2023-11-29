/*
 * In this problem, we are given an array of unsorted integers . Our task is to find a peak element in the array.
 * A peak element is an element whose neighbors have value smaller than that of the element. 
 */
package Searching;

public class PeakElement {
    public static void main(String[] args) {
        int arr[] = {6,7,8,20,12};
        System.out.println(peakEle(arr));
    }
    static int peakEle(int[] nums){
        if(nums.length==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        int left = 1, right = nums.length-2;
        while(left<=right){
            int mid = (left+right)/2;            
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[mid-1]>nums[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }
}
