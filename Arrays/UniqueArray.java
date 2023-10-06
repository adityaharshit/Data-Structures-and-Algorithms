//write a program to check whether an array is unique or not
package Arrays;

public class UniqueArray {
    public static void main(String[] args){
        UniqueArray ua = new UniqueArray();
        int[] arr = {1,2,3,4,6,6,7,8,9,10};
        System.out.println(ua.isUnique(arr));
    }
    public boolean isUnique(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                    return false;
            }
        }
        return true;
    }
}
