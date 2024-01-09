package Matrix;

import Searching.BinarySearch;
import java.util.*;
public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.toString(searchNum(arr, 20)));
    }
    static int[] searchNum(int[][] arr, int target){
        int[] res = new int[2];
        res[0]=-1;
        res[1] = -1;
        int col = arr[0].length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]<= target && arr[i][col]>=target){
                int ind = BinarySearch.binarySearch(arr[i], target);
                if(ind!=-1){
                    res[0] = i;
                    res[1] = ind;
                }
                break;
            }
        }
        return res;
    }
}
