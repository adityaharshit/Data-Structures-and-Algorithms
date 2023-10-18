//We are given a number. The task is to find the factorial of the number.

package Mathematics;

public class Factorial {
    public static void main(String[] args){
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(10));
        System.out.println(factorial.factorialRecursive(10));
    }
    public int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
            fact *= i;
        return fact;
    }
    //Recursive Approach
    public int factorialRecursive(int n){
        if(n==0)
            return 1;
        return n*factorialRecursive(n-1);
    }
}

/*
 * time Complexity : Θ(n)
 * Aux space for Recursive approach: Θ(n)
 */