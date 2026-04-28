class Solution {
    public int lengthOfLongestSubstring(String s) {

        
        int maxl = 0;
        int start = 0;

        Set<Character> set = new LinkedHashSet<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
           

            
                while(set.contains(ch)){
                    set.remove(s.charAt(start));
                    start++;
                }
                set.add(ch);
                
                if(maxl < set.size()) maxl = set.size();
                
            

        }
        return maxl;
    }
}
