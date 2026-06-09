class Solution {

    static String binary(int n){

        String ans = "";
        while(n > 0){
            ans+=(n%2);
            n/=2;
        }
        return ans;

    }

    public boolean consecutiveSetBits(int n) {

        String str = binary(n);
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            char ch = str.charAt(i);
            if(ch == '1' && str.charAt(i+1) == '1'){
                count++;
            }

        }
        return count==1;
        
    }
}
