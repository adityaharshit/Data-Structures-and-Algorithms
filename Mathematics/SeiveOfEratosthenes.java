//Given a number n, print all primes smaller than or equal to n. It is also given that n is a small number.
package Mathematics;

public class SeiveOfEratosthenes {
    public static void main(String[] args){
        SeiveOfEratosthenes seiveOfEratosthenes = new SeiveOfEratosthenes();
        seiveOfEratosthenes.seive(5);
    }
    public void seive(int num){
        boolean[] seive = new boolean[num+1];
        for(int i=2;i<=num;i++){
            if(seive[i]!=true){
                System.out.print(i+" ");
                for(int j=i*i;j<=num;j+=i){
                    seive[j]=true;
                }
            }
        }
    }
}
/*
 * Time Complexity : Θ(n*log(log(n)))
 */