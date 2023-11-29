//In this particular problem, we are provided with a sorted array of integers. Our objective is to determine whether there exists a triplet of integers in the array whose sum is equal to the target value given.
package Searching;

public class TripletSum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,8,9,20,40};
        System.out.println(tripletSum(arr,36));
    }
    static boolean tripletSum(int[] arr, int target){
        for(int i=0;i<arr.length-2;i++){
            int left =i+1,right=arr.length-1;
            while(left<right){
                int sum = arr[left]+arr[right] +arr[i];
                if(sum==target){
                    return true;
                } else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return false;
    }
}
