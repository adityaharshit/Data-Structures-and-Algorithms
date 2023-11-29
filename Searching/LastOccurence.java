//locate the last occurrence of an element within an array that contains repetitive elements. 
package Searching;

public class LastOccurence {
    public static void main(String[] args) {
        int[] arr = {10,10,10,10,10,10,10};
        System.out.println(lastOcc(arr,10));
    }
    public static int lastOcc(int[] arr, int val){
        int left = 0, right = arr.length-1;
        int mid = (left+right)/2;
        while(left<=right){
            if(arr[mid]==val){
                if((mid+1)<arr.length && arr[mid+1]==val){
                    left = mid+1;
                }else
                    return mid;
            }else if(arr[mid]<val){
                left = mid+1;
            }else{
                right = mid-1;
            }
            mid = (left+right)/2;
        }
        return -1;
    }
}
