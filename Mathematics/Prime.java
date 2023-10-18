//We are given a number. The task is to check if the number is prime or not.
package Mathematics;

public class Prime {
    public static void main(String[] args){
        Prime prime = new Prime();
        System.out.println(prime.isPrime(1021));
    }
    public boolean isPrime(int n){
        if(n==1)
            return false;
        else if(n==2 || n==3)
            return true;
        else if(n%2==0 || n%3==0)
            return false;
        for(int i=5;i*i<=n;i=i+6)
            if(n%i==0 || n%(i+2)==0)
                return false;
        return true;
    }
}
/*
 * Time Complexity : Θ(sqrt(n))
 */