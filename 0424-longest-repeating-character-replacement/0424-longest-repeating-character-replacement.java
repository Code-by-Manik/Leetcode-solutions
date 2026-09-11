class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();

        char nums[] = s.toCharArray();
        int max=0;
        int max_freq=0;

        int i=0;
        int j=0;

        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);

            max_freq = Math.max(max_freq,map.get(nums[j]));

            int rest=j-i+1 - max_freq;
            while(rest>k){
                char last=nums[i];
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(last) == 0)
                    map.remove(last);
                
                i++;
                rest=j-i+1 - max_freq;
            }

            int len = j-i+1;
            max = Math.max(len,max);
            j++;
        }

        return max;


    }
}