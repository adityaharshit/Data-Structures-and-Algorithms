//In this particular problem, we are presented with a sorted binary array, which consists solely of 0's and 1's. Our objective is to determine the frequency of 1's in the array by utilizing the technique of binary search.
package Searching;

public class CountOnes {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,1,1,1,1};
        int lzero = LastOccurence.lastOcc(arr, 0);
        if(lzero==-1){
            System.out.println(arr.length);
        } else if(lzero == arr.length-1){
            System.out.println(0);
        } else{
            System.out.println(arr.length - lzero -1);
        }
    }
}
