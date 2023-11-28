/*
 * An element is a leader if it is greater than all the elements to its right side. And the rightmost element is always a leader.
 * Given an array, the task is to write a program to print all the LEADERS in the array.
 */
package Arrays;

public class LeaderInArray {
    public static void main(String[] args) {
        int arr[] = {7,10,4,3,6,5,2};
        leaders(arr);
    }
    static void leaders(int[] arr){
        int max=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                System.out.println(arr[i]);
            }
        }
    }
}
