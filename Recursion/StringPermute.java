package Recursion;

import java.util.Arrays;

public class StringPermute {
    public static void main(String[] args) {
        char[] arr = {'A','B','C','D'};
        permute(arr,0);
    }
    static void permute(char[] arr, int index){
        if(index==arr.length-1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i=index;i<arr.length;i++){
            char ch = arr[i];
            arr[i]=arr[index];
            arr[index]=ch;
            permute(arr, index+1);
            ch = arr[i];
            arr[i]=arr[index];
            arr[index]=ch;
        }
    }
    
}
