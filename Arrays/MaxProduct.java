//Write a program to find maximum product of two integers in the array where all elements are positive
package Arrays;

public class MaxProduct {
    public static void main(String[] args){
        MaxProduct mp = new MaxProduct();
        int[] arr = {5,3,8,2,5,3,6};
        System.out.println(mp.findMaxProduct(arr));
    }
    public int findMaxProduct(int[] arr){
        int max1=0,max2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max1){
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>=max2){
                max2=arr[i];
            }
        }
        return (max1)*(max2);
    }
}
