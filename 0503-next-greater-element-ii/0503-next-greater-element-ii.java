class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int[] answer=new int[nums.length];
        Arrays.fill(answer,-1);

        for(int i=0;i<2*(nums.length);i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i%nums.length]){
                int prevIndex=stack.pop();
                answer[prevIndex]=nums[i%nums.length];
            }
            stack.push(i%nums.length);
        }
        return answer;
    }
}