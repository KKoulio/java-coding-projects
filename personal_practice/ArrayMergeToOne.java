package personal_practice;

import java.util.Arrays;

/**
 * Merges 2 arrays where the 1st array has the size of both arrays combined.
 * An example main is included.
 *
 * @author kyria
 */
public class ArrayMergeToOne {

    public static void main(String[] args) {
        // Initialization
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m = 3;
        int n = 3;

        // Merge arrays and display the result
        merge(nums1, m, nums2, n);
    }

    /**
     * Merges the 2 arrays
     *
     * @param nums1 First Array
     * @param m First Array's size
     * @param nums2 Second Array
     * @param n Second Array's size
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++){
            nums1[i] = nums2[j];
            i++;
        }

        Arrays.sort(nums1);
    }
}
