//We are given an n-digit number. The task is to find the number of digits in the number, provided that, n>0.

package Mathematics;

public class CountDigits {
    public static void main(String[] args){
        CountDigits countDigits = new CountDigits();
        System.out.println(countDigits.countDigits(9999));
    }
    public int countDigits(int n){
        // return (int)Math.log10((double)n) +1;
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
}

/* Time Complexity : Θ(n)
 * For the commented code:Θ(1)
 * Space Complexity : Θ(1)
 * Auxiliary Space : Θ(1)
 */
