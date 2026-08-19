class Solution {
    public int maxVowels(String s, int k) {
        int vowelSum=0;   
        char[] arr=s.toLowerCase().toCharArray();
        for(int i=0;i<k;i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                vowelSum++;
            }
        }
         int maxVowelSum=vowelSum;
        for(int i=k;i<arr.length;i++){
             if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                vowelSum++;
            }
             if(arr[i-k]=='a'||arr[i-k]=='e'||arr[i-k]=='i'||arr[i-k]=='o'||arr[i-k]=='u'){
                vowelSum--;
            }
            
            maxVowelSum=Math.max(vowelSum, maxVowelSum);
        }
        return maxVowelSum;
    }
}