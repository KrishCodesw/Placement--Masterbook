class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n=deck.length;
        Queue<Integer> queue=new LinkedList<>();

        for(int i=0;i<n;i++){
            queue.offer(i);
        }

        int[] result=new int[n];
        for(int card:deck){
            result[queue.poll()]=card;
            
            if(!queue.isEmpty()){
                queue.offer( queue.poll());
            }
        }
        return result;
    }
}