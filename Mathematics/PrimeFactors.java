//We are given a number n. The task is to print all prime factors of n. 
package Mathematics;

public class PrimeFactors {
    public static void main(String[] args){
        PrimeFactors primeFactors = new PrimeFactors();
        primeFactors.primeFactors(1119341632);
    }
    public void primeFactors(int n){
        while(n%2==0){
            System.out.print(2+" ");
            n/=2;
        }
        while(n%3==0){
            System.out.print(3+" ");
            n/=3;
        }
        for(int i=5;i*i<=n;i+=6){
            while(n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
            while(n%(i+2)==0){
                System.out.print((i+2)+" ");
                n/=(i+2);
            }
        }
        
        if(n>3){
            System.out.print(n);
        }
    }
}
/*
 * Time Complexity : Θ(sqrt(n))
 */