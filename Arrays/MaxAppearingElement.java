//Given two arrays L[ ] and R[ ] of size N where L[i] and R[i] (0 ? L[i], R[i] < 106) denotes a range of numbers, the task is to find the maximum occurred integer in all the ranges. If more than one such integer exists, print the smallest one
package Arrays;

public class MaxAppearingElement {
    public static void main(String[] args) {
        int[] left = {1,4,3,1};
        int[] right = {9,8,5,4};
        System.out.println(maxElement(left,right));
    }
    static int maxElement(int[] left, int[] right){
        int max = 0;
        for(int num:right){
            max = Math.max(max, num);
        }
        int[] frequency = new int[max+2];
        for(int i=0;i<left.length;i++){
            frequency[left[i]]++;
            frequency[right[i]+1]--;
        }
        int res=0;
        for(int i=1; i<frequency.length;i++){
            frequency[i] = frequency[i-1]+frequency[i];
            if(frequency[i]>frequency[res])
                res = i;
        }
        return res;
    }
}
