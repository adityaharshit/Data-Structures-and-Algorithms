//write a program to find all pairs of integers whose sum is equal to a given number
package Arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){
        TwoSum ts = new TwoSum();
        int[] arr = {1,2,3,4,6,7,8,9,10};
        int sum = 20;
        ts.findPairs(arr, sum);
        System.out.println(Arrays.toString(ts.findPairs(arr, sum)));
    }
    public int[] findPairs(int[] arr, int sum){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
