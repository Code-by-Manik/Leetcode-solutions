class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;
        int size = s.length();
        String ans = "";

        for(char i : s.toCharArray()){
            if(i == '1') count++;
        }

        while(size > 1){
            if(count > 1){
            ans+="1";
            count--;
            }
            else{
                ans+="0";
            }
            size--;
        }
        ans+="1";
        return ans;
    }
}
