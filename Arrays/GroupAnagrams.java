package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args){
        GroupAnagrams ga = new GroupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(ga.groupAnagrams(strs));
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashSet<String> distinctValue = new HashSet<String>();
        for(int i=0;i<strs.length;i++){
            String str1 = sortArr(strs[i]);
            List<String> list = new ArrayList<>();
            if(distinctValue.contains(str1))
                continue;
            else{
                distinctValue.add(str1);
                list.add(strs[i]);
            }
            for(int j=i+1;j<strs.length;j++){
                String str2 = sortArr(strs[j]);
                if(str2.equals(str1)){
                    list.add(strs[j]);
                }
            }
            result.add(list);
        }
        return result;

    }
    public String sortArr(String str){
        char[] ch = new char[str.length()];
        ch = str.toCharArray();
        Arrays.sort(ch);
        String s = new String(ch);
        return s;
    }
}
