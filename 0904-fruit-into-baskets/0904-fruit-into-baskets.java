class Solution {

    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map=new HashMap<>();
        int left=0;
        int maxFruits=0;
        for(int right=0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while(map.size()>2){
                map.put(fruits[left],map.getOrDefault(fruits[left],0)-1);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxFruits=Math.max(maxFruits, right - left + 1);
        }
        return maxFruits;
    }
}