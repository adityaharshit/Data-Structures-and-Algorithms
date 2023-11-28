//Given an array of N non-negative integers arr[ ] representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after rain.
package Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {2,0,2};
        System.out.println(calcWater(arr));
    }
    static int calcWater(int[] arr){
        int res=0,left=0,temp=0;
        for(int i=1;i<arr.length;i++){
            if(arr[left]>arr[i]){
                temp+=arr[left]-arr[i];
            }else{
                res+=temp;
                left=i;
                temp=0;
            }
        }
        temp=0;
        if(left<arr.length-1){
            int max=left;
            left = arr.length-1;
            for(int i=arr.length-2;i>=max;i--){
                if(arr[left]>arr[i]){
                    temp+=arr[left]-arr[i];
                }else{
                    res+=temp;
                    left=i;
                    temp=0;
                }
            }
        }
        return res;
    }
}
