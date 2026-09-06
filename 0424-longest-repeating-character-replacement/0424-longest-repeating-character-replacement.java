class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=0;
        int max=0;
        int max_freq = 0;
        char str[] = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        while(j<s.length()){
            map.put(str[j],map.getOrDefault(str[j],0)+1);
            for(char q:map.keySet()){
                if(map.get(q) > max_freq){
                     max_freq = map.get(q);
                }
            }
            int len = j-i+1;
            int rest = len - max_freq;

            while(rest > k){
            char last = str[i];
            map.put(str[i],map.get(str[i])-1);
            if(map.get(last) == 0) map.remove(last);
            i++;
            max_freq = 0;
            for(char q:map.keySet()){
                if(map.get(q) > max_freq){
                     max_freq = map.get(q);
                }
            }
            len = j-i+1;
            rest = len - max_freq;


            }

        
        if(len > max) max = len;

        j++;

        }
        return max;
    }
}