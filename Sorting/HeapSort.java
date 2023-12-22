package Sorting;

import java.util.Arrays;

public class HeapSort {
    static void heapSort(int[] arr){
        buildHeap(arr);
        for(int i=arr.length-1;i>=0;i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr, i, 0);
        }
    }
    static void buildHeap(int[] arr){
        int n=arr.length;
        for(int i=(n-2)/2;i>=0;i--){
            heapify(arr, n, i);
        }
    }
    static void heapify(int[] arr, int n, int index){
        int largest = index, left = index*2+1, right = index*2+2;
        if(left<n && arr[left]>arr[largest]) largest = left;
        if(right<n && arr[right]>arr[largest]) largest = right;
        if(largest!=index){
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
    public static void main(String[] args) {
        int[] arr = {20,40,30,60,50};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
