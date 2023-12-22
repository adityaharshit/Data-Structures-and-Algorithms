package Sorting;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,4,5,5,6,6,6,6};
        int[] arr2 = {1,2,2,4,4,4};
        printUnion(arr1,arr2);
    }
    static void printUnion(int[] arr1, int[] arr2){
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
                System.out.println(arr1[i]);
                i++;
            }else{
                System.out.println(arr2[j]);
                j++;
            }
        }
        while(i<len1){
            while(i+1<len1 && arr1[i]==arr1[i+1]) i++;
            System.out.println(arr1[i]);
            i++;
        }
        while(j<len2){
            while(j+1<len1 && arr2[j]==arr2[j+1]) j++;
            System.out.println(arr2[j]);
            j++;
        }
    }
}
