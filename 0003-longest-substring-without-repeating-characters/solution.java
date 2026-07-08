class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max=0;
        
        HashMap<Character,Integer> seen = new HashMap<>();

        int left=0;
        int right=0;

        while(right<s.length()){
           
           
            
            if(seen.containsKey(s.charAt(right))){
                left = Math.max(left, seen.get(s.charAt(right)) + 1);
              
            }

            seen.put(s.charAt(right),right);
            int size = right - left + 1;
            if(size > max) max = size;
            right++;

        }



    return max;

    }
}
