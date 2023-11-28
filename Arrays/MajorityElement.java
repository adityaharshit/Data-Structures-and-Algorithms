//Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 

package Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {5,4,13,5,5,4,5};
        System.out.println(majority(arr));
    }
    static int majority(int[] arr){
        int res=0, count=1;
        int len = arr.length;
        for(int i=1;i<len;i++){
            if(arr[i]==arr[res])
                count++;
            else{
                count--;
            }
            if(count==0){
                res=i;
                count=1;
            }
        }
        count=0;
        for(int num:arr){
            if(arr[res]==num)
                count++;
        }
        if(count>len/2){
            return res;
        }
        return -1;
    }
}
