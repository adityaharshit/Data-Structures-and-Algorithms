package Searching;

public class BinaryRecursive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4,4,4,4,5,6,7,8};
        System.out.println(binaryRec(arr,4,0,arr.length-1));
    }
    static int binaryRec(int[] arr, int val,int left, int right){
        if(left>right){
            return -1;
        }
        int mid = (left+right)/2;
        if(arr[mid]==val){
            return mid;
        }else if(arr[mid]<val){
            return (binaryRec(arr, val, mid+1, right));
        } else{
            return binaryRec(arr, val, left, mid-1);
        }
    }
}
