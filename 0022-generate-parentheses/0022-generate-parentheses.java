class Solution {

    static void helper(int size,String s,int open,int close,List<String> ans){
        if(s.length() == 2*size){
            ans.add(s);
            return;
        }

        if(open<size){
            helper(size,s+'(',open+1,close,ans);

        }
        if(close<open){
            helper(size,s+')',open,close+1,ans);
        }

    }

    public List<String> generateParenthesis(int n) {
        
        List<String> ans = new ArrayList<>();

        helper(n,"",0,0,ans);

        return ans;

    }
}