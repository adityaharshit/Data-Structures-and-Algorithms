//Printing a matrix in a snake pattern is a programming technique in which the elements of a two-dimensional array are traversed in a zigzag pattern, resembling the movement of a snake. This approach provides a visually appealing output and can be useful in certain applications, such as displaying matrices or grids in a non-conventional manner.
package Matrix;

public class SnakePattern {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        snakePattern(arr);
    }
    static void snakePattern(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                int j=0;
                while(j<arr[i].length){
                    System.out.println(arr[i][j]);
                    j++;
                }
            }else{
                int j=arr[i].length-1;
                while(j>=0){
                    System.out.println(arr[i][j]);
                    j--;
                }
            }
        }
    }
}
