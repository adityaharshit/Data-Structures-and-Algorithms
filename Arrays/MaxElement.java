//Find the Largest Number in an Array
package Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr= {1,2,9,4,5,6};
        System.out.println(largestEle(arr));
    }
    static int largestEle(int[] arr){
        int res=Integer.MIN_VALUE;
        for(int num:arr){
            res=Math.max(num, res);
        }
        return res;
    }
}
