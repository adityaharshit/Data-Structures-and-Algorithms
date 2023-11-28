//Given an array arr[ ] of non-negative integers and an integer sum, find a subarray that adds to a given sum.
package Arrays;

public class GivenSumSubArray {
    public static void main(String[] args) {
        int[] arr = {1,4,20,3,10,5};
        System.out.println(subArr(arr,4));
    }
    static boolean subArr(int[] arr,int sum){
        int left = 0,res=0;
        for(int i=0;i<arr.length;i++){
            res+=arr[i];
            while(res>sum){
                res-=arr[left];
                left++;
            }
            if(res==sum)
                return true;
        }
        
        return false;
    }
}
