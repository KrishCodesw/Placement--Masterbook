class Solution {
    public int splitArray(int[] nums, int k) {
          int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        while (start < end) {
            // try for middle as the potential ans
            int mid = start + (end -start) / 2;
            // calculate how many peices you can divide this in with this max sum
            int sum = 0;
            int peices = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // you cannot add this in this subarray , make new one
                    sum = num;
                    peices++;
                } else {
                    sum += num;
                }
            }
            if (peices > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}