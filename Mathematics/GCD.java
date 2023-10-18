//We are given two numbers. The task is to find the GCD / HCF of the numbers.
package Mathematics;

public class GCD {
    public static void main(String[] args){
        GCD gcd = new GCD();
        System.out.println(gcd.gcd(3,8));
        System.out.println(gcd.gcdRec(12,15));
    }
    public int gcd(int a,int b){
        while(a!=b){
            if(b<a && a%b==0)
                return b;
            if(a<b && b%a==0)
                return a;
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    //Recursive Approach
    public int gcdRec(int a,int b){
        if(b==0)
            return a;
        return gcdRec(b,a%b);
    }
}
/*
 * Time Complexity : Θ(min(a,b))
 * Time Complexity for Recursive Approach : Θ(log(min(a,b)))
 */