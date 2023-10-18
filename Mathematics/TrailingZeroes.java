//We are given a number. The task is to find the Number of Trailing Zeros in the factorial of the number.
package Mathematics;

public class TrailingZeroes {
    public static void main(String[] args){
        TrailingZeroes trailingZeroes = new TrailingZeroes();
        System.out.println(trailingZeroes.trailingZeroes(100));
    }
    public int trailingZeroes(int n){
        int count=0;
        for(int i=5;i<=n;i=i*5)
            count += n/i;
        return count;
    }
}

/*
 * Time Complexity : Θ(logn)
 * Auxiliary Space : Θ(1)
 */