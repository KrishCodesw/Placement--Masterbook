class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int k=p.length();
        int n=s.length();
        
        int[] pCount=new int[26];
        int[] sCount=new int[26];
        List<Integer> result=new ArrayList<>();
        if(k>n)return result;

        for(int i=0;i<k;i++){
            pCount[p.charAt(i)-'a']++;
            sCount[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pCount,sCount)){
            result.add(0);
        }

        for(int i=k;i<n;i++){
             sCount[s.charAt(i)-'a']++;
             sCount[s.charAt(i-k)-'a']--;
            if(Arrays.equals(pCount,sCount)){
            result.add(i-k+1);
        }
        }
    return result;
    }
}