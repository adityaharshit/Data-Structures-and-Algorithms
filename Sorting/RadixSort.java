package Sorting;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {100,8,6,56,314,596};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void radixSort(int[] arr){
        int greatest=0;
        for(int num:arr){
            greatest = Math.max(greatest, num);
        }
        for(int res = 1;greatest/res>0;res=res*10){
            countSort(arr, res);
        }
    }

    static void countSort(int arr[], int exp)
    {
        int n = arr.length;
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
}
