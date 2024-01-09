/*
 * Examples:

Input:
1  2  3
4  5  6
7  8  9
Output:        
3  6  9 
2  5  8 
1  4  7 
Input:
1  2  3  4 
5  6  7  8 
9 10 11 12 
13 14 15 16 

Output:        
4 8 12 16 
3 7 11 15 
2 6 10 14 
1 5  9 13    
 */
package Matrix;
import java.util.*;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        rotateMatrix(arr);
        System.out.println(Arrays.deepToString(arr));
    }
    static void rotateMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                swap(arr, i ,j);
            }
        }
        for(int i=0;i<arr.length;i++){
            int low =0, high = arr.length-1;
            while(low<high){
                int temp = arr[low][i];
                arr[low][i] = arr[high][i];
                arr[high][i] = temp;
                low++;
                high--;
            } 
        }
    }
    static void swap(int[][] arr, int i, int j){
        int temp=arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;

    }
}
