//Given an array a[ ] of N integers, the task is to find the length of the longest Alternating Even Odd subarray present in the array
package Arrays;

public class EvenOddSub {
    public static void main(String[] args) {
        int[] arr ={1,2,3,6};
        System.out.println(maxLen(arr));
    }
    static int maxLen(int[] arr){
        int res=1;
        int prevParity=arr[0]%2;
        int count=1;
        for(int i=1;i<arr.length;i++){
            int parity = arr[i]%2;
            if(prevParity==parity){
                count=0;
            } else{
                count++;
                res = Math.max(res,count);
            }
            prevParity = parity;
        }
        return res;
    }
}
