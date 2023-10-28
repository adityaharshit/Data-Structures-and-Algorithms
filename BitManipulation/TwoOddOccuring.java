//find two numbers that occurs odd number of times in a given array of Integers
package BitManipulation;

public class TwoOddOccuring {
    public static void main(String[] args){
        TwoOddOccuring tOdd = new TwoOddOccuring();
        int[] arr={1,3,2,3,3,1};
        tOdd.oddOccuring(arr);
    }
    public void oddOccuring(int[] arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
            res = res^arr[i];
        }
        int k=res&(~(res-1));
        int first=0,second=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]&k)==0)
                first = first^arr[i];
            else
                second = second^arr[i];
        }
        System.out.println(first+" "+second);
    }
}
