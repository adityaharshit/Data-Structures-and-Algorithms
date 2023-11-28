//Given an array, the task is to Left Rotate an Array by D.
package Arrays;
import java.util.*;

public class LeftRotateByD {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        leftRotate(arr,5);
        System.out.println(Arrays.toString(arr));
    }
    // static void leftRotate(int[] arr, int D, int iter){
    //     if(iter==D){
    //         return;
    //     }
    //     int temp=arr[0];
    //     for(int i=1;i<arr.length;i++){
    //         arr[i-1]=arr[i];
    //     }
    //     arr[arr.length-1]=temp;
    //     leftRotate(arr, D, iter+1);
    // }

    /*
    static void leftRotate(int[] arr, int D){
        if(D%arr.length==0)
            return;
        if(D>arr.length){
            D = D%arr.length;
        }
        int[] temp = new int[D];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(i<D)
                temp[i]=arr[i];
            else{
                arr[count]=arr[i];
                count++;
            }
        }
        count=0;
        for(int i=arr.length-D;i<arr.length;i++){
            arr[i]=temp[count];
            count++;
        }

    }
    */

    static void leftRotate(int arr[], int D){
        if(D%arr.length==0)
            return;
        if(D>arr.length){
            D = D%arr.length;
        }
        for(int i=0;i<D/2;i++){
            swap(arr,i,D-i-1);
        }
        for(int i=D;i<(arr.length+D)/2;i++){
            swap(arr, i, arr.length-i-1+D);
        }
        for(int i=0;i<arr.length/2;i++){
            swap(arr, i, arr.length-i-1);
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
