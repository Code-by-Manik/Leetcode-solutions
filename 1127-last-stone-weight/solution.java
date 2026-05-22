class Solution {
    public int lastStoneWeight(int[] stones) {

        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            pq.add(i);
        }

        while(pq.size()>1){
        int maxi = pq.remove();
        int smaxi = pq.remove();

        if(maxi!=smaxi){
            pq.add(maxi - smaxi);
        }
    }

    if(pq.size()==1) return pq.poll();
    return 0;
}


        
    }
