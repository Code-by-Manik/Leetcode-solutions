class Solution {

    static boolean check(String string,int s,int e){
        int i=s;
        int j=e;

        while(i<j){
            if(string.charAt(i)!=string.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {

        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                boolean left = check(s,i+1,j);
                boolean right = check(s,i,j-1);

                return left || right;


            }

            i++;
            j--;
        }

        return true;

        
    }
}