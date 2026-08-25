class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for(int i:nums){
            set.add(i);
        }

        for(int i=1;i<=100;i++){
            int n = k*i;
            if(!set.contains(n)){
                return n;
            }
        }
        return 101;
        
    }
}