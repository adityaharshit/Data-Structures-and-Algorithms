//Given an array, the task is to Left Rotate an Array by One.
package Arrays;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        leftRotate(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void leftRotate(int[] arr){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1]=temp;
    }
}
