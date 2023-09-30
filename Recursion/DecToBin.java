package Recursion;

public class DecToBin {
    public static void main(String[] args){
        DecToBin d = new DecToBin();
        String bin = d.decToBin(10);
        System.out.println(bin);
    }

    public String decToBin(int n){
        if(n < 0){
            return "-1";
        }
        if(n == 0 || n == 1){
            return Integer.toString(n);
        }
        return decToBin(n/2) + Integer.toString(n%2);
    }
    
}
