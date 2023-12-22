//In this problem, we are presented with a number, and our objective is to utilize binary search to determine the floor value of its square root in logarithmic complexity.


package Searching;

public class SquareRoot {
    public static void main(String[] args) {
        int a =2;
        System.out.println(findSquareRoot(a));
    }
    static int findSquareRoot(int a){
        int left = 1, right = a;
        int mid = (left+right)/2;
        while(left<=right){
            int square = mid*mid;
            if(square==a){
                return mid;
            } else if(square<a){
                left = mid+1;
            }else{
                right = mid-1;
            }
            mid  = (left+right)/2;
        }
        return mid;
    }
}
