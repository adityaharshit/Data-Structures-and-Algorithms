/*
 * In this problem, we have an array where each element appears only once except for a single element that has multiple occurrences. Additionally, the array always contains the number 0, and if the maximum element in the array is x, then all elements from 0 to x are guaranteed to be present in the array
 */
package Searching;

public class RepeatingElements {
    public static void main(String[] args) {
        int[] arr = {1,3,2,2};
        System.out.println(findEle(arr));
    }
    static int findEle(int[] arr){
        int max = arr[0],sum=0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            sum+=arr[i];
        }
        int n = arr.length;
        int expSum = (max*(max+1))/2;
        return (sum-expSum)/(n-max);
    }
}
