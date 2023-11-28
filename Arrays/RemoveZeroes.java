//Given an Array, the task is to move all the zeroes to the end while keeping the order of elements intact.
package Arrays;

import java.util.Arrays;

public class RemoveZeroes {
    public static void main(String[] args){
        int[] arr = {0,0,2,3,0,0,4,5,6};
        removeZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void removeZeroes(int[] arr){
        int count=0,numZero =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                numZero++;
            } else{
                if(numZero==0)
                    continue;
                arr[count] = arr[i];
                arr[i]=0;
                count++;
            }
        }
    }
}
