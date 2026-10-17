class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result={-1,-1};
        result[0]=findPosition(nums,target,true);
        result[1]=findPosition(nums,target,false);
        return result;
    }
    private int findPosition(int[]nums,int target, boolean findFirst){
        int s = 0;
        int e = nums.length - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if(nums[mid]==target){
                ans=mid;
                if(findFirst){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }else if(nums[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return ans;
    }
}