//Remove the duplicate items from a sorted array
package Arrays;


public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr= {1,1,1,2,2,2,2,2,2,4,4,4,4,4,4,5,5,5,5,5,5,6,6,6,6,7,3,3,3};
        int size= removeDup(arr,arr.length);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int removeDup(int[] arr, int size){
        int pos=1;
        for(int i=1;i<size;i++){
            if(arr[i]!=arr[i-1]){
                arr[pos]=arr[i];
                pos++;
            }
        }
        return pos;
    }
}
