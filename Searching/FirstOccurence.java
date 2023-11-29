//locate the first occurrence of an element within an array that contains repetitive elements. 
package Searching;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {10,10,10,10,10,10,10,10};
        System.out.println(firstOcc(arr, 10));
    }
    public static int firstOcc(int[] arr, int val){
        int left = 0,right=arr.length-1;
        int mid = (left+right)/2;
        while(left<=right){
            if(arr[mid]==val){
                if((mid-1)>=0 && arr[mid-1]==val){
                    right = mid-1;
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
