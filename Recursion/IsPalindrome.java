package Recursion;

public class IsPalindrome {
    public static void main(String[] args){
        IsPalindrome i = new IsPalindrome();
        String str = "maddam";
        boolean isPal = i.isPalindrome(str);
        System.out.println(isPal);
    }
    public boolean isPalindrome(String str){
        if(str.length()==0 || str.length()==1){
            return true;
        }
        if(str.charAt(0)!=str.charAt(str.length()-1)){
            return false;
        }
        return isPalindrome(str.substring(1, str.length()-1));
    }
}
