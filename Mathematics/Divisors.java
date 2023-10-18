//We are given a number n. The task is to print all the divisors of n. 
package Mathematics;

public class Divisors {
    public static void main(String[] args){
        Divisors divisors = new Divisors();
        divisors.divisors(99);
        divisors.divisors(101);
        divisors.divisors(182);
        divisors.divisors(176);
        divisors.sortedDiv(100);
    }

    //for printing the divisors in pairs
    public void divisors(int num){
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
                if(i!=num/i){
                    System.out.print(num/i+" ");
                }
            }            
        }
    }

    //for printing the divisors in sorted order
    public void sortedDiv(int num){
        System.out.println("\n");
        int i;
        for(i=1;i*i<num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
            
        }
        for(;i<=num/2;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.print(num);
    }
}

/*
 * Time Complexity : Θ(sqrt(n))
 */