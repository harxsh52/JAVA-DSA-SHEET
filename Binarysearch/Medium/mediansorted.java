package Bianrysearch.Medium;

public class mediansorted {
    class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;

        if (totalLength % 2 == 1) {
            // For odd length, find the single middle element (e.g., 5th element for size 9)
            return (double) findKthElement(nums1, nums2, totalLength / 2 + 1);
        } else {
            // For even length, find the two middle elements and average them
            double r1 = (double) findKthElement(nums1, nums2, totalLength / 2);
            double r2 = (double) findKthElement(nums1, nums2, totalLength / 2 + 1);
            return (r1 + r2) / 2.0;
        }
    }

    // Renamed for clarity and corrected the infinite loop
    public int findKthElement(int[] a, int[] b, int k) {
        int i = 0; // Pointer for array 'a'
        int j = 0; // Pointer for array 'b'
        int count = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                count++;
                if (count == k) return a[i];
                i++;
            } else {
                count++;
                if (count == k) return b[j];
                j++; // Correctly increment j
            }
        }

        // If array 'a' is exhausted, the rest are in 'b'
        while (j < b.length) {
            count++;
            if (count == k) return b[j];
            j++;
        }

        // If array 'b' is exhausted, the rest are in 'a'
        while (i < a.length) {
            count++;
            if (count == k) return a[i];
            i++;
        }
        
        return -1; // Should not be reached
    }
}
}
