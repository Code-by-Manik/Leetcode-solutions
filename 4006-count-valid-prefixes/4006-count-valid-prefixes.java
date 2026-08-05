class Solution {
    public int countValidPrefixes(String s) {
        int sum0=0;
        int sum1=0;

        int ans=0;
        for(char i:s.toCharArray()){
            if(i=='0')sum0++;
            else sum1++;

            int diff = sum0 - sum1;

            if(Math.abs(diff)<=1){
                ans++;
            }
        }

        return ans;
        
    }
}