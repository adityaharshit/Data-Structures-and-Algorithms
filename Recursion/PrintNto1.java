package Recursion;

public class PrintNto1 {
    public static void main(String[] args){
        PrintNto1 pt = new PrintNto1();
        pt.printNto1(10);
    }
    public void printNto1(int n){
        if(n==0)
            return;
        System.out.println(n);
        printNto1(n-1);
    }
}
