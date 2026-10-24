class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int end=0;
        for(int weight: weights){
            if(weight>max){
                max=weight;
            }
            end+=weight;
        }
        int start=max;
        int ans=end;


        while(start<=end){
            // ship's max capacity per day is mid 
            
            int mid = start + (end - start) / 2;
            int currentWeight=0;
            int daysNeeded=1;

            for(int w:weights){
                if(currentWeight+w>mid){
                    daysNeeded++;
                    currentWeight=w;
                }else{
                    currentWeight+=w;
                }
            }
            if(daysNeeded<=days){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}