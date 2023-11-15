package Recursion;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr={10,5,2,3,6};
        
        System.out.println(subset(arr,0,0,8));
    }
    static int subset(int[] arr,int sum, int index, int k){
        if(index==arr.length){
            if(sum==k){
                return 1;
            }
            return 0;
        }
        return subset(arr,sum,index+1,k) + subset(arr,sum+arr[index],index+1,k);
    }
}
