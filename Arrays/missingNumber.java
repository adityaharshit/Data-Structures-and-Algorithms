package Arrays;

public class missingNumber {
    public static void main(String[] args){
        missingNumber mn = new missingNumber();
        int[] arr = {1,2,3,4,6,7,8,9,10};
        int missingNumber = mn.findMissingNumber(arr);
        if(missingNumber == 0)
            System.out.println("No missing number");
        else
            System.out.println("Missing number is: "+missingNumber);
    }
    public int findMissingNumber(int[] arr){
        int lastNumber = arr[arr.length-1];
        int sum = (lastNumber*(lastNumber+1))/2;
        int arrSum=0;
        for(int i:arr){
            arrSum+=i;
        }
        return sum-arrSum;
        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i]+1!=arr[i+1])
        //         return arr[i]+1;
        // }
        // return -1;
    }
}
