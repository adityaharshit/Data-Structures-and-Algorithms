package Recursion;

public class GCD {
    public static void main(String[] args){
        GCD g = new GCD();
        int gcd = g.gcd(47, 21);
        System.out.println(gcd);
    }   
    public int gcd(int n, int m){
        if(n==m){
            return n;
        }
        else if(n>m){
            if(n%m==0){
                return m;
            }
            else{
                return gcd(m, n%m);
            }
        }
        else{
            if(m%n==0){
                return n;
            }
            else{
                return gcd(n, m%n);
            }
        }
    }
}
