package Searching;

public class TotalOccurence {
    public static void main(String[] args) {
        int[] arr = {10,10,10,10,10};
        int val = 20;
        int first = FirstOccurence.firstOcc(arr, val);
        if(first==-1){
            System.out.println(0);
        } else
            System.out.println(LastOccurence.lastOcc(arr, val) - first+1);
    }
    
}
