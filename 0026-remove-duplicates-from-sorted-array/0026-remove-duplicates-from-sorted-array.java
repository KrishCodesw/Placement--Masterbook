class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        // already unique, at index 0;
        int fast=1;
        int slow=1;
        while(fast<nums.length){
            if(nums[fast]!=nums[fast-1]){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}