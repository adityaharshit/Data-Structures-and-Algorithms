package Recursion;

public class IsPalindrome {
    public static void main(String[] args){
        IsPalindrome i = new IsPalindrome();
        String str = "madfam";
        boolean isPal = i.isPalindrome(str, 0, str.length()-1);
        System.out.println(isPal);
    }
    public boolean isPalindrome(String str, int start, int end){
        if(start>=end){
            return true;
        }
        else if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return isPalindrome(str, ++start, --end);
    }
}
