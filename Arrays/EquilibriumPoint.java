//Given a sequence arr[ ] of size n, Write a function int equilibrium(int[] arr, int n) that returns an equilibrium index (if any) or -1 if no equilibrium index exists.
package Arrays;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr ={4,2,2};
        System.out.println(equilibrium(arr));
    }
    static boolean equilibrium(int[] arr){
        int[] leftSum = new int[arr.length];
        int[] rightSum = new int[arr.length];
        leftSum[0]=0;
        for(int i=1;i<arr.length;i++){
            leftSum[i]=leftSum[i-1]+arr[i-1];
        } 
        rightSum[arr.length-1]=0;
        for(int i=arr.length-2;i>=0;i--){
            rightSum[i]=rightSum[i+1]+arr[i+1];
        } 
        for(int i=0;i<arr.length;i++){
            if(leftSum[i]==rightSum[i])
                return true;
        }
        return false;
    }
}
