package Sorting;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int a[] = {10,15,20,20};
        int b[] = {1,10,12};
        mergeSorted(a,b);
    }
    static void mergeSorted(int[] a, int[] b){
        int n1= a.length;
        int n2 = b.length;
        int arr[] = new int[n1+n2];
        int count1=0, count2=0;
        int count=0;
        while(count1<n1 && count2<n2){
            if(a[count1]<=b[count2]){
                arr[count] = a[count1];
                count++;
                count1++;
            }else{
                arr[count] = b[count2];
                count++;
                count2++;
            }
        }
        while(count1<n1){
            arr[count] = a[count1];
            count1++;
            count++;
        }
        while(count2<n2){
            arr[count] = b[count2];
            count2++;
            count++;
        }
        for(int num:arr){
            System.out.println(num);
        }
    }
}
