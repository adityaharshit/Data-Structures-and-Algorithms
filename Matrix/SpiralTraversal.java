package Matrix;

public class SpiralTraversal {
    public static void main(String[] args){
        int[][] arr = {{1,   2,   3,   4,  5,   6},
        {7,   8,   9,  10,  11,  12},
        {13,  14,  15, 16,  17,  18}};
        spiralTraversal(arr);
    }
    static void spiralTraversal(int[][] arr){
        int inci=0, incj=1;
        int row=arr.length, col= arr[0].length;
        int lim = row*col;
        int right = arr[0].length-1, left=0, top=1, bottom = arr.length-1;
        int i=0,j=0;
        int count=0;
        while(count<lim){
            System.out.print(arr[i][j]+" ");
            if(incj==1 && j==right){
                incj=0;
                inci=1;
                right--;
            }
            else if(incj==-1 && j==left){
                incj=0;
                inci=-1;
                left++;
            }
            else if(inci==-1 && i==top){
                incj=1;
                inci=0;
                top++;
            }
            else if(inci==1 && i==bottom){
                incj=-1;
                inci=0;
                bottom--;
            }
            i+=inci;
            j+=incj;
            count++;
        }
    }
}
