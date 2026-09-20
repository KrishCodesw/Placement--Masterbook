class Solution {
    public int reverseDegree(String s) {

        char[] arr= s.toCharArray();
        int totalDegree=0; 

        for(int i=0; i<s.length();i++){
           char c=s.charAt(i);
           int stringIndex=i+1;
           int reversePos=26-(c-'a');
           totalDegree+=reversePos*stringIndex;
        }
        return totalDegree;
    }
}