//In this problem we are given a sorted array that is rotated a certain number of times . Our task is to detect the presence of a given target element in the array .
package Searching;

public class SearchRotated {
    public static void main(String[] args) {
        int[] arr = {0,1};
        System.out.println(findElement(arr,1));
    }
    static int findElement(int[] arr, int target){
        int left =0, right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                return mid;
            } else if(arr[mid]>arr[left]){
                if(target>arr[left] && target<arr[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{
                if(target>arr[mid] && target<=arr[right]){
                    left = mid+1;
                } else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
