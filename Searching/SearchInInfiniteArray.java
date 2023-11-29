//In this particular challenge, we are presented with a sorted infinite array. Our objective is to determine the presence or absence of a given target element in the array. We will go through both the naive solution and the optimized solution that employs binary search for solving the problem.
package Searching;

public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
        System.out.println(searchInArr(arr,3));
    }
    static int searchInArr(int[] arr, int val){
        if(arr[0]==val) return 0;
        int first =0, last = 1;
        while(arr[last]<val){
            last*=2;
        }
        if(arr[last]==val) return last;
        first = last/2;
        int mid = (first+last)/2;
        while(first<=last){
            if(arr[mid]==val){
                return mid;
            }else if(arr[mid]<val){
                first = mid+1;
            }else{
                last = mid-1;
            }
            mid = (first+last)/2;
        }
        return -1;
    }
}
