package Recursion;

public class Print1toN {
    public static void main(String[] args){
        print1ToN(1,10);
    }
    static void print1ToN(int i, int n){
        if(i==n+1)
            return;
        System.out.println(i);
        print1ToN(i+1,n);
    }
}
