package Sorting;

import java.util.Arrays;

class CountInversion{
    public static void main(String[] args){
        long[] arr = {5,4,3,2,1};
        long res = inversionCount(arr, (long)arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(res);
    }
    static long inversionCount(long arr[], long N)
    {
        long res = mergeSort(arr,0,(int)N-1);
        return res;
    }
    static int mergeSort(long[] arr, int left, int right){
        int res=0;
        if(right>left){
            int mid = left+(right-left)/2;
            res+=mergeSort(arr, left, mid);
            res+=mergeSort(arr, mid+1, right);
            res+=mergeFunction(arr, left, mid, right);
        }
        return res;
    }
    static int mergeFunction(long[] arr, int low, int mid, int high){
        int index=low,len=high-low+1;
        long[] sorted = new long[len];
        int lim = mid;
        mid++;
        int count=0,res=0;
        while(low<=lim && mid<=high){
            if(arr[low]<=arr[mid]){
                sorted[count]=arr[low];
                low++;
            }else{
                sorted[count] = arr[mid];
                res+=lim-low+1;
                mid++;
            }
            count++;
        }
        while(low<=lim){
            sorted[count] = arr[low];
            count++;
            low++;
        }
        while(mid<=high){
            sorted[count] = arr[mid];
            count++;
            mid++;
        }
        for(int i=0;i<len;i++){
            arr[index] = sorted[i];
            index++;
        }
        return res;
    }
}