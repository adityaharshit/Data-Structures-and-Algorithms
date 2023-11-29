package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(arr, 9));
    }
    static int binarySearch(int[] arr, int val){
        int left =0, right = arr.length-1;
        int mid = (left+right)/2;
        while(left<=right){
            if(arr[mid]==val){
                return mid;
            }
            else if(arr[mid]<val){
                left = mid+1;
            }else{
                right = mid-1;
            }
            mid = (left+right)/2;
        }
        return -1;
    }
}
