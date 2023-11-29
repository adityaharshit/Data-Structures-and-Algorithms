//In this particular problem, we are provided with two sorted arrays of integers. Our objective is to determine the median of these two arrays where N is the size of the first array and M is the size of the second array
package Searching;

public class MedianSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2}; 
        int arr2[] = {3,4};
        System.out.println(calcMedian(arr1,arr2));
    }
    static double calcMedian(int[] nums1, int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;

        if (n1 > n2) {
            return calcMedian(nums2, nums1); // Ensure nums1 is smaller in length
        }

        int begin = 0;
        int end = n1;
        int total = n1 + n2;

        while (begin <= end) {
            int i1 = (begin + end) / 2;
            int i2 = (total + 1) / 2 - i1;

            int maxLeft1 = (i1 == 0) ? Integer.MIN_VALUE : nums1[i1 - 1];
            int minRight1 = (i1 == n1) ? Integer.MAX_VALUE : nums1[i1];
            int maxLeft2 = (i2 == 0) ? Integer.MIN_VALUE : nums2[i2 - 1];
            int minRight2 = (i2 == n2) ? Integer.MAX_VALUE : nums2[i2];

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                if (total % 2 == 0) {
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
                } else {
                    return Math.max(maxLeft1, maxLeft2);
                }
            } else if (maxLeft1 > minRight2) {
                end = i1 - 1;
            } else {
                begin = i1 + 1;
            }
        }
        return 0;
    }
}

