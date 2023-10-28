// Problem: Given an integer, write a function to determine if it is a power of two.
package BitManipulation;

public class PowerOfTwo {
    public static void main(String[] args){
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOfTwo(15));
    }
    public boolean isPowerOfTwo(int n){
        if(n==0)
            return false;
        return (n&(n-1))==0;
    }
}
