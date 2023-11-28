//Given a binary array, find the count of the maximum number of consecutive 1's present in the array.
package Arrays;

public class MaxOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,1,1,1,1,0,0,1};
        System.out.println(maxOnes(arr));
    }
    static int maxOnes(int[] arr){
        int res=0,count=0;
        for(int num:arr){
            if(num==1){
                count++;
                res=Math.max(res,count);
            }else{
                count=0;
            }
        }
        return res;
    }
}
