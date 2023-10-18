//We are given an n-digit number. The task is to find if the number is palindrome or not, provided that, n>=0.

package Mathematics;

public class PalindromeNumber {
    public static void main(String[] args){
        PalindromeNumber pn = new PalindromeNumber();
        int num = 2;
        System.out.println(pn.isPlaindrome(num));
    }
    public boolean isPlaindrome(int num){
        int rev=0,temp=num;
        while(temp>0){
            rev = rev*10 + temp%10;
            temp=temp/10;
        }
        return rev==num;
    }
}

/*
 * Time Complexity : Θ(d), where d is the number of digits in the number
 */