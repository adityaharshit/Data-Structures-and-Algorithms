package Recursion;

public class RopeCutting {
    public static void main(String[] args){
        System.out.println(cutRope(9,2,2,2));
    }
    static int cutRope(int n, int a, int b, int c){
        if(n==0){
            return 0;
        } if(n<0){
            return -1;
        }
        int result=Math.max(cutRope(n-a,a,b,c),Math.max(cutRope(n-b,a,b,c),cutRope(n-c,a,b,c)));
        return result==-1? -1 : result+1;
    }
}
