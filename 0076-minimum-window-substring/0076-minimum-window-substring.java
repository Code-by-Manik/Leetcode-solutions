class Solution {
    static boolean check(Map<Character,Integer> map){
        for(char i:map.keySet()){
            if(map.get(i)>0){
                return false;
            }
        }

        return true;
    }
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        Map<Character,Integer> map = new HashMap<>();

        for(char i:t.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int i=0;
        int j=0;
        int min = s.length();
        String ans = "";
        char nums[] = s.toCharArray();
        while(j<s.length()){
            if(map.containsKey(nums[j]))
            map.put(nums[j],map.get(nums[j])-1);

            while(check(map)){
                int len = j-i+1;
                if(len <= min){ 
                min = len;
                ans = s.substring(i,j+1);
                }
                if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);

                i++;
            }
            j++;

        }

        return ans;
        
    }
}