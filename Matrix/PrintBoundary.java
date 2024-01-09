/*
 * Matrix boundary traversal refers to the process of accessing and printing the elements present on the outermost edges of a two-dimensional array
 * or matrix. By iterating through the boundary elements in a specific order, we can extract and display the values along the perimeter of the 
 * matrix. This technique is often employed in various programming scenarios, such as image processing, matrix manipulation, 
 * and algorithmic problem-solving, where analyzing or displaying only the boundary elements is required.
 */
package Matrix;

public class PrintBoundary {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4},{5,6}};
        printBoundary(arr);
    }
    static void printBoundary(int[][] arr){
        int inci=0, incj=1;
        int row=arr.length, col= arr[0].length;
        int lim = (row>2 && col>2)? (row*col)-((row-2)*(col-2)) : row*col;
        int right = arr[0].length-1, left=0, top=0, bottom = arr.length-1;
        int i=0,j=0;
        int count=0;
        while(count<lim){
            System.out.println(arr[i][j]);
            if(incj==1 && j==right){
                incj=0;
                inci=1;
            }
            else if(incj==-1 && j==left){
                incj=0;
                inci=-1;
            }
            else if(inci==-1 && i==top){
                incj=1;
                inci=0;
            }
            else if(inci==1 && i==bottom){
                incj=-1;
                inci=0;
            }
            i+=inci;
            j+=incj;
            count++;
        }
    }
}
