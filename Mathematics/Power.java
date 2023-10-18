//We are given two numbers. The task is to compute Power(x,n)  which means x to the power y.
package Mathematics;

public class Power {
    public static void main(String[] args){
        Power power = new Power();
        System.out.println(power.power(2.1, 3));
    }
    public double power(double x,int n){
        if(n==0){
            return 1;
        }
        
        return n%2==0?power(x,n/2)*power(x,n/2):x*power(x,n/2)*power(x,n/2);
    }
}
