class Solution {
    public int lengthOfLongestSubstring(String s) {

        char str[] = s.toCharArray();
        Set<Character> set = new HashSet<>();

        int i=0;
        int j =0;
        int max = 0;
        while(j<s.length()){
            while(set.contains(str[j]) && i<j){
                set.remove(str[i]);
                i++;
            }

            set.add(str[j]);

            int len = j-i+1;

            if(len > max) max = len;
            j++;
        }
        
        return max;
    }
}