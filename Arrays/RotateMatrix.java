//Given an image represented by an N*N matrix, write a method to rotate the image by 90 degrees.
package Arrays;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args){
        RotateMatrix rm = new RotateMatrix();
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rm.rotate(matrix);
        
    }
    public boolean rotate(int[][] matrix){
        if(matrix.length==0 || matrix.length!=matrix[0].length){
            return false;
        }
        int n=matrix.length;
        for(int layer=0;layer<n/2;layer++){
            int first=layer;
            int last=n-1-layer;
            for(int i=first;i<last;i++){
                int offset=i-first;
                int top=matrix[first][i];
                matrix[first][i]=matrix[last-offset][first];
                matrix[last-offset][first]=matrix[last][last-offset];
                matrix[last][last-offset]=matrix[i][last];
                matrix[i][last]=top;
                System.out.println(layer+" "+i+" "+offset+" "+first+" "+last);
            }
            
        }
        System.out.println(Arrays.deepToString(matrix));
        return true;
    }
}
