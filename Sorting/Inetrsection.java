// take two sorted arrays and pick out the intersection elements from the two arrays.
package Sorting;

public class Inetrsection {
    public static void main(String[] args) {
        int[] arr1 = {7,8,9,10,11,12};
        int[] arr2 = {1,2,3,4,5,6};
        printInterSection(arr1,arr2);
    }
    static void printInterSection(int[] arr1, int[] arr2){
        int i=0, j=0;
        int len1 = arr1.length, len2 = arr2.length;
        while(i<len1 && j<len2){
            while(i+1<len1 && arr1[i]==arr1[i+1]) i++;
            while(j+1<len2 && arr2[j]==arr2[j+1]) j++;
            if(arr1[i]==arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
        }
    }
}
