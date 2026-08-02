class Solution {
    public int minimumPushes(String word) {

        int freq[] = new int[26];

        for(char i:word.toCharArray()){
            freq[i-'a']++;
        }
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<freq.length;i++){
            if(freq[i]>0)
            map.put(freq[i],i);
        }

        Arrays.sort(freq);
        int idx=0;
        int push=1;
        int sum=0;

        for(int i=freq.length-1;i>=0;i--){
            sum+=freq[i]*push;
            idx++;
            if(idx==8){
                idx%=8;
                push++;
            }

        }

        return sum;
        
    }
}