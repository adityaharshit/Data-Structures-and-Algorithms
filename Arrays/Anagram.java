package Arrays;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args){
        Anagram a = new Anagram();
        System.out.println(a.isAnagram("abc","cba"));
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character, Integer> str1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> str2 = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            if(str1.containsKey(s.charAt(i))){
                str1.compute(s.charAt(i),(key,val) -> (val==null)?1:++val);
            }
            else{
                str1.put(s.charAt(i),1);
            }
        }
        System.out.println(str1);
        for(int i=0;i<t.length();i++){
            if(str1.containsKey(t.charAt(i))){
                str1.compute(t.charAt(i),(key,val) -> (val==1)?null:--val);
            }
            else{
                return false;
            }
        }
        System.out.println(str2);
        if(str1.isEmpty()){
            return true;
        }
        return false;
    }
}
