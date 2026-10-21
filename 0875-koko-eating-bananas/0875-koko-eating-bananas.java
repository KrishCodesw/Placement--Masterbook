class Solution {
    public int minEatingSpeed(int[] piles, int h) {
            int maxSpeed=0;
            for(int pile:piles){
                if(pile>maxSpeed){
                    maxSpeed=pile;
                }
            }

            int start=1;
            int end=maxSpeed;
            int ans=maxSpeed;

            while(start<=end){
                int mid=start+(end-start)/2;
                // we need minimum speed to finish all bananas 
                long totalHours=0;
                for(int pile:piles){
                    totalHours+=(pile+mid-1)/mid;
                }
                if(totalHours<=h){
                    ans=mid;
                    end=mid-1;
                }else{
                    start=mid+1;
                }
                
            }
            return ans;
               
    }
}