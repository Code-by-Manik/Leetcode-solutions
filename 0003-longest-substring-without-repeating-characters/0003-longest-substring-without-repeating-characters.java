class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1) return s.length();
        Set<Character> set = new HashSet<>();

        int i=0;
        int j=0;
        int max=0;

        char str[] = s.toCharArray();

        while(j<str.length){
            while(set.contains(str[j]) && i<j){
                set.remove(str[i]);
                i++;
            }
            set.add(str[j]);
            j++;

            int len = j-i+1;
            if(len > max) max = len;
        }
        return max-1;
         
    }
}