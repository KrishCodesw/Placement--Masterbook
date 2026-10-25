class Solution {
    public int splitArray(int[] nums, int k) {
        int start=0; // yenjoh element hau woh array ka largest element hau
        int end=0;   // yeh joh element hai woh pure array ka sum hau

        for(int num:nums){
            start=Math.max(start,num);
            end+=num;
        }
        int ans=end;
        while(start<=end){
            int mid=start+(end-start)/2;
            int numOfSubArrays=1;
            int currentSum=0;

            for(int num:nums){
                if(currentSum+num>mid){
                    numOfSubArrays++;
                    currentSum=num;
                }else{
                    currentSum+=num;
                }
            }
            if(numOfSubArrays>k){
                start=mid+1;
            }else{
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
}