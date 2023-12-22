//You are given arrival and departure times of the guests, you need to find the minimum time interval to attend the party so that there are maximum people at the party.
package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class MettMaxinumGuest {
    public static void main(String[] args) {
        int[] arrival = {800,700,600,500};
        int[] dep = {840,820,830,530};
        int res = countGuest(arrival, dep);
        System.out.println(res);
    }
    static int countGuest(int[] arrival, int[] dep){
        int[][] arr = new int[arrival.length][2];
        for(int i=0;i<arrival.length;i++){
            arr[i][0] = arrival[i];
            arr[i][1] = dep[i];
        }
        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
        int res=0, count=1, result=0, arriv=Integer.MIN_VALUE, dpt=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[res][1]>=arr[i][0]){
                arr[res][0] = Math.min(arr[res][0], arr[i][0]);
                arr[res][1] = Math.max(arr[res][1], arr[i][1]);
                count++;
                if(count>result){
                    arriv = Math.max(arriv, arr[i][0]);
                    dpt = Math.min(dpt, arr[i][1]);
                    result = count;
                }
            }else{
                res++;
                count=1;
                arr[res][0] = arr[i][0];
                arr[res][1] =arr[i][1];
            }
        }
        System.out.println(arriv+" "+dpt);
        return result;
    }
}

/*
static int maxGuest(int[] arrival, int[] dept){
    Arrays.sort(arrival);
    Arrays.sort(dept);
    int i=0,j=0,len = arrival.length;
    int count=0, res=0;
    while(i<len && j<len){
        if(arrival[i]<=dept[j]){
            count++; i++;
        }else{
            count--;j++;
        }
        res = Math.max(count,res);
    }
    return res;
}
 */