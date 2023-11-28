//Check if the Array is Sorted
package Arrays;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,40,5,6,7,8};
        System.out.println(checkArr(arr));
    }
    static boolean checkArr(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;
    }
}
