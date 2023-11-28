//Given a sorted array, arr[] consisting of N integers, the task is to find the frequencies of each array element.
package Arrays;

public class FrequencyOfElenent {
    public static void main(String[] args) {
        int[] arr = {7,8};
        freq(arr);
    }
    static void freq(int[] arr){
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1])
                count++;
            else{
                System.out.println("Frequency of "+arr[i-1]+" is "+count);
                count=1;
            }
        }
        System.out.println("Frequency of "+arr[arr.length-1]+" is "+count);
    }
}
