//the transpose of a matrix is an operation that involves rearranging the elements of a two-dimensional array by interchanging its rows and columns.
package Matrix;
import java.util.*;
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        transposeMatrix(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        // System.out.println(Arrays.deepToString(arr));
    }
    static void transposeMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
