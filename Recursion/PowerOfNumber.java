package Recursion;

public class PowerOfNumber {
    public static void main(String[] args){
        PowerOfNumber p = new PowerOfNumber();
        int pow = p.power(3, 4);
        System.out.println(pow);
    }
    public int power(int n, int m){
        if(m<0){
            return -1;
        }
        if(m==0){
            return 1;
        }
        return n * power(n,--m);
    }
}
