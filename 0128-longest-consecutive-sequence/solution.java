class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;

        Set<Integer> s = new TreeSet<>();
       

        for(int i : nums){
            s.add(i);
        }

      List<Integer> l = new ArrayList<>();

      for(int i:s){
        l.add(i);
      }

      int currlen = 1;
      int maxlen = 1;

      for(int i=0;i<l.size()-1;i++){
        if((l.get(i) + 1) == l.get(i+1)){
           currlen++;
        }
        else{
            if(currlen > maxlen){
                maxlen = currlen;
                
            }
            currlen = 1;
        }
      }
    if(currlen > maxlen) maxlen = currlen;

        return maxlen;
    }
}
