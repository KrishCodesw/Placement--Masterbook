class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int right=0;right<nums.length;right++){
        currentSum+=nums[right];
        if(right>=k){

            currentSum-=nums[left];
            left++;
        }
        if(right>=k-1){
        maxSum=Math.max(currentSum,maxSum);
        }
        }
        return (double) maxSum/k;
    }
}