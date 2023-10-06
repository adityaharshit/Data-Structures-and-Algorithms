package Recursion;
import java.lang.String;
public class StringReverse {
    public static void main(String[] args){
        StringReverse s = new StringReverse();
        String str = "Hello";
        String rev = s.reverse(str);
        System.out.println(rev);
    }
    public String reverse(String str){
        if(str.length()==0){
            return "";
        }
        return str.charAt(str.length()-1) + reverse(str.substring(0,str.length()-1));
    }
}
