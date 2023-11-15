package Recursion;

public class JosephProblem {
    public static void main(String[] args) {
        System.out.println(josephProblem(5, 2));
    }
    static int josephProblem(int n, int k){
        if(n==1)
            return 0;
        else
            return (josephProblem(n-1, k)+k)%n;
    }
}
