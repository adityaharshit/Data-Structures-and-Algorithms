package Sorting;
import java.util.*;

public class LomutoPartition {
    public static void main(String[] args) {
        int[] arr = {3,7,6,4,2,5,1,5};
        int res = lomutoPartition(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr)+" "+res);
    }
    static int lomutoPartition(int[] arr, int l, int h){
        int val = arr[h];
        int i=l-1;
        for(int j=l;j<h;j++){
            if(arr[j]<val){
                i++;
                int temp=arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[h];
        arr[h] = temp;
        return i;
    }
}
