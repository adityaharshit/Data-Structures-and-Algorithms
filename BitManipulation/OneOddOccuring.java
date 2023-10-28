//find a number that occurs odd number of times in a given array of Integers
package BitManipulation;

public class OneOddOccuring {
    public static void main(String[] args){
        OneOddOccuring odo = new OneOddOccuring();
        int[] arr={4,8,8,4,4,5,5};
        System.out.println(odo.oddNum(arr));
    }
    public int oddNum(int[] arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
            res = res^arr[i];
        }
        return res;
    }
}
