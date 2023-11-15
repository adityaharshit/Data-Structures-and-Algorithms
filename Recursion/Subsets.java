package Recursion;

public class Subsets {
    public static void main(String[] args) {
        subset("", "abcdefg", 0);
    }
    static void subset(String curr, String str, int index){
        if(index==str.length()){
            System.out.println(curr);
            return;
        }
        subset(curr, str, index+1);
        curr+=str.charAt(index);
        subset(curr, str, index+1);
    }
}
