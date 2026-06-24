public class ReversePaiir {

    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 1, 2, 4 };
        int ans = reversePairs(nums);
        System.out.println(ans);
    }

    public static int reversePairs(int[] nums) {
        if (nums == null || nums.length == 1) {
            return 0;
        }
        return mergeSortandCount(nums, 0, nums.length - 1);
    }

    public static int mergeSortandCount(int[] nums, int left, int right) {
        if (left >= right) {
            return 0;
        }
        int mid = left + (right - left) / 2;
        int count = 0;
        count += mergeSortandCount(nums, left, mid);
        count += mergeSortandCount(nums, mid + 1, right);
        count += countPairs(nums, left, mid, right);

        merge(nums, left, mid, right);
        return count;
    }

    public static int countPairs(int[] nums, int left, int mid, int right) {
        int pairsCount = 0;
        int j = mid + 1; // right half initial value pointer

        for (int i = left; i <= mid; i++) {
            while (j <= right && nums[i] > 2 * (long) nums[j]) {
                j++;
            }
            pairsCount += (j - (mid + 1));
        }
        return pairsCount;

    }

    public static void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0; // pointer for the temp array

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++]; // copy and increment post copying trick
            } else {
                temp[k++] = nums[j++];
            }
        }
        // Copy any remaining elements from the left side
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // Copy any remaining elements from the right side
        while (j <= right) {
            temp[k++] = nums[j++];
        }
        // Copy the sorted temp array back into the original nums array
        for (int p = 0; p < temp.length; p++) {
            nums[left + p] = temp[p];
        }
    }
}