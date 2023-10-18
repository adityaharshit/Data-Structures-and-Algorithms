package Mathematics;

public class LCM {
    public static void main(String[] args){
        LCM lcm = new LCM();
        System.out.println(lcm.lcm(3,8));
    }
    public int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    public int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}
/*
 * Time Complexity : Θ(log(min(a,b)))
 */
