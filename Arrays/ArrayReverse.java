//Write a program to reverse an array in java
package Arrays;
import java.util.*;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseArr(int arr[]){
        int len=arr.length;
        for(int i=0;i<len/2;i++){
            int temp = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-1-i]=temp;
        }
    }
}
