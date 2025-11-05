class Solution {
    public int reversePairs(int[] nums) {
        return sortAndCount(nums, 0, nums.length - 1);
    }

    // Sorts the array and counts reverse pairs recursively
    private int sortAndCount(int[] nums, int start, int end) {
        if (start >= end) return 0;

        int mid = start + (end - start) / 2;
        int count = 0;

        // Count reverse pairs in left and right halves
        count += sortAndCount(nums, start, mid);
        count += sortAndCount(nums, mid + 1, end);

        // Count cross reverse pairs where i < j and nums[i] > 2 * nums[j]
        count += countReversePairs(nums, start, mid, end);

        // Merge the two sorted halves
        merge(nums, start, mid, end);

        return count;
    }

    // Count reverse pairs across two halves [start..mid] and [mid+1..end]
    private int countReversePairs(int[] nums, int start, int mid, int end) {
        int count = 0;
        int j = mid + 1;

        for (int i = start; i <= mid; i++) {
            while (j <= end && nums[i] > (long) 2 * nums[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }

        return count;
    }

    // Standard merge function for merge sort
    private void merge(int[] nums, int start, int mid, int end) {
        int left = start, right = mid + 1, k = 0;
        long[] temp = new long[end - start + 1];

        // Merge sorted halves into temp
        while (left <= mid && right <= end) {
            if (nums[left] <= nums[right]) {
                temp[k++] = nums[left++];
            } else {
                temp[k++] = nums[right++];
            }
        }

        // Copy remaining elements
        while (left <= mid) {
            temp[k++] = nums[left++];
        }
        while (right <= end) {
            temp[k++] = nums[right++];
        }

        // Copy sorted elements back into original array
        for (int i = 0; i < temp.length; i++) {
            nums[start + i] = (int) temp[i];
        }
    }
}