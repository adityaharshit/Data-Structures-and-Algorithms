package Sorting;

import java.util.Arrays;

public class DistinctCycleSort {
    static void cycleSortDistinct(int[] arr, int n){
        int count=0;
        for(int cs=0;cs<n-1;cs++){
            int item = arr[cs];
            int pos = cs;
            for(int i=cs+1;i<n;i++){
                if(arr[i]<item)
                    pos++;
            }
            if(pos==cs)
                continue;
            while(item==arr[pos]) pos++;
            if(pos!=cs){
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
                count++;
            }
            while(pos!=cs){
                pos = cs;
                for(int i=cs+1;i<n;i++){
                    if(arr[i]<item)
                        pos++;
                }
                while(item==arr[pos])
                    pos++;
                if(item!=arr[pos]){
                    int temp1 = item;
                    item = arr[pos];
                    arr[pos] = temp1;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        int[] arr = {1, 8, 3, 9, 10, 10, 2, 4};
        cycleSortDistinct(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
