class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        int n=s2.length();

        if(k>n){
            return false;
        }
        int[] count1=new int[26];
        int[] count2=new int[26];
        for(int i=0;i<k;i++){
            count1[s1.charAt(i)-'a']++;
            count2[s2.charAt(i)-'a']++;
        }
        if (Arrays.equals(count1, count2)) {
            return true;
        }
        for(int i=k;i<n;i++){
            count2[s2.charAt(i)-'a']++;
            count2[s2.charAt(i-k)-'a']--;
            if (Arrays.equals(count1, count2)) {
                return true;
            }
        }
        return false;
    }
}