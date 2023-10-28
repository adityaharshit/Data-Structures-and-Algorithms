//In this program we will learn to create a power set of a given set by using bitwise operators. The method works by using the set bit to indicate the presence of a particular element , and running a loop from 0 to 2n-1 (where n is the number of elements ) which will cover all possible subsets of the given set
package BitManipulation;

public class PowerSet {
    public static void main(String[] args){
        PowerSet ps = new PowerSet();
        ps.powerSet("abcdef");
    }
    public void powerSet(String str){
        int len= str.length();
        int limit = (int)Math.pow(2,len);
        for(int i=0;i<limit;i++){
            int count=0;
            StringBuilder res = new StringBuilder();
            while(count<len){
                if(((i>>count)&1)==1){
                    res.append(str.charAt(count));
                }
                count++;
            }
            System.out.println(res);
        }
    }
}
