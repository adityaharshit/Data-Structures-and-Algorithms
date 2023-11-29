package Searching;

public class AllocateMinPage {
    public static void main(String[] args) {
        int[] arr = {10,20,10,30};
        int k=1;
        System.out.println(minPage(arr,k));
    }
    static int minPage(int[] arr, int k){
        int sum=0, max =0;
        for(int num:arr){
            sum+=num;
            max = Math.max(max,num);
        }
        int left=max,right=sum,res=0;
        while(left<=right){
            int mid = (left+right)/2;
            int count = check(arr,mid);
            if(count<=k){
                right = mid-1;
                res=mid;
            }else{
                left = mid+1;
            }
        }
        return res;
    }
    static int check(int[] arr, int mid){
        int count=1;
        int sum=0;
        for(int num:arr){
            if(sum+num>mid){
                count++;
                sum=num;
            }else
                sum+=num;
        }
        return count;
    }
}
