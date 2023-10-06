//Write a program to check whether two given arrays are permutation of each other or not
package Arrays;
public class PermutationArray{
    public static void main(String[] args){
        PermutationArray pa = new PermutationArray();
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,5,4,2,3};
        boolean isPermutation = pa.checkPermutation(arr1,arr2);
        if(isPermutation)
            System.out.println("Arrays are permutation of each other");
        else
            System.out.println("Arrays are not permutation of each other");
    }
    public boolean checkPermutation(int[] arr1,int[] arr2){
        if(arr1.length!=arr2.length)
            return false;
        int sum1=0,sum2=0,mul1=1,mul2=1;
        for(int i=0;i<arr1.length;i++){
            sum1+=arr1[i];
            sum2+=arr2[i];
            mul1*=arr1[i];
            mul2*=arr2[i];
        }
        if(sum1!=sum2 || mul1!=mul2)
            return false;
        return true;
    }
}