package Recursion;
public class ProductOfArr {
    public static void main(String[] args){
        ProductOfArr p = new ProductOfArr();
        int[] arr = {1,2,3,4,5};
        int prod = p.product(arr, 0);
        System.out.println(prod);
    }
    public int product(int[] arr, int n){
        if(n==arr.length){
            return 1;
        }
        return arr[n] * product(arr, ++n);
    }
}
