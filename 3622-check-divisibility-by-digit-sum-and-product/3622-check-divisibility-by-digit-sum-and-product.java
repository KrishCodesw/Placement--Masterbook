class Solution {
    public boolean checkDivisibility(int n) {
        int oGn=n;
        int sum=0;
        int product=1;
        if(n<=0){
            return false;
        }
        while(n>0){
            sum+=n%10;
            product*=n%10;
            n/=10;
        }
        int valueSum=sum+product;

        if(oGn%valueSum==0){
            return true;
        }
        return false;
    }
}