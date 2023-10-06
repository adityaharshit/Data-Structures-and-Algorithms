public class PowerOfNum {
    public double myPow(double x, int n) {
        if(n==0)
            return 1;
        if(x==1)
            return 1;
        if(x==-1)
            return n%2==0?1:-1;
        
        int len=Integer.MIN_VALUE==n?Integer.MAX_VALUE:Math.abs(n);
        double power=x;
        for(int i=1;i<len;i++){
            power=power*x;
        }
        if(n<0)
            return 1/power;
        return power;
    }
    public static void main(String[] args){
        PowerOfNum p = new PowerOfNum();
        double pow = p.myPow(2.0, -2147483648);
        System.out.println(pow);
    }
}
