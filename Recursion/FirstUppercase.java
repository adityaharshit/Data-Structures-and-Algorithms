package Recursion;

public class FirstUppercase {
    public static void main(String[] args){
        FirstUppercase f = new FirstUppercase();
        String str = "helLo";
        char ch = f.firstUppercase(str, 0);
        System.out.println(ch);
    }
    public char firstUppercase(String str, int n){
        if(n>=str.length()){
            return '0';
        }
        else if(str.charAt(n)>=65 && str.charAt(n)<=90){
            return str.charAt(n);
        }
        return firstUppercase(str,++n);
    }
}
