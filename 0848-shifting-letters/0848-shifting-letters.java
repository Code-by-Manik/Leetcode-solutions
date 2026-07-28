class Solution {
    public String shiftingLetters(String s, int[] shifts) {

        String string = "abcdefghijklmnopqrstuvwxyz";

        char str[] = new char[26];

        for(int i=0;i<string.length();i++){
            str[i] = string.charAt(i);
        }

        char ans[] = s.toCharArray();

        int sum = 0;

        for(int i=s.length()-1;i>=0;i--){
            sum+=shifts[i]%26;

            int idx = (int)((ans[i] - 'a' + sum) % 26);

    

            ans[i] = str[idx];

        }

        return new String(ans);
        
    }
}