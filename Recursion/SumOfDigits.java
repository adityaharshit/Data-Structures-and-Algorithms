// sum of digits o positive integer using recursion
package Recursion;

public class SumOfDigits {
    public static void main(String[] args){
        SumOfDigits s = new SumOfDigits();
        int sum = s.sum(43);
        System.out.println(sum);
    }
    public int sum(int n){
        if(n<0){
            return -1;
        }
        if(n==0){
            return 0;
        }
        return sum(n/10) + n%10;
    }
    
}
