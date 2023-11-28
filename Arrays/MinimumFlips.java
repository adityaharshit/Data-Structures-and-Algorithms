//Given a binary array, we need to convert this array into an array that either contains all 1s or all 0s.  We need to do it using the minimum number of group flips.
package Arrays;

public class MinimumFlips {
    public static void main(String[] args) {
        int[] arr={1,1,0,0,0,1,1,1,0,0,0};
        minFlips(arr);
    }
    static void minFlips(int[] arr){
        int first = arr[0],count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==first){
                if(count==0){
                    continue;
                }
                System.out.print(" to "+(i-1)+"\n");
                count=0;
                continue;
            }
            if(count==0)
                System.out.print("from "+i);
            count++;
        }
        if(count!=0){
            System.out.println(" to "+(arr.length-1));
        }
    }
}
