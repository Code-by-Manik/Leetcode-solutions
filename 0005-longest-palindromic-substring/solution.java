class Solution {

    static boolean check(String s){
        StringBuilder sb = new StringBuilder(s);

        String rev = sb.reverse().toString();

        return s.equals(rev);

    }

    public String longestPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1){
            return s;
        }

        int max = 0;
        String ans = "";
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    String str = s.substring(i,j+1);
                    if(check(str) && str.length() > max){
                        max = str.length();
                        ans = str;
                    }
                }
            }
        }

        if(ans.equals("")) ans = ""+s.charAt(0);

        return ans;
    }
}
