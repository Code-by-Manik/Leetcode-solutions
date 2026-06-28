class Solution {
    public long maxSum(int[] nums, int k, int mul) {

        long total = 0;
        // Max Priority queue-
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i:nums){
            q.add(i);
        }

    while(k-->0){
        if(mul>1){
            total += 1L*q.remove()*mul;
            mul--;
        }
        else{
            total+=q.remove();
            mul--;
        }
    }

    return total;
        
    }
}
