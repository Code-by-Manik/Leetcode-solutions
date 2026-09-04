class Solution {

    static void helper(int size,int open,int close,String str,List<String> ans){
        if(str.length() == size*2){
            ans.add(str);
        }

        if(open < size){
            str+='(';
            helper(size,open+1,close,str,ans);
        str = str.substring(0,str.length()-1);

        }
        if(close < open){
            str+=')';
            helper(size,open,close+1,str,ans);
        str = str.substring(0,str.length()-1);


        }
    }

    public List<String> generateParenthesis(int n) {
        

        List<String> ans = new ArrayList<>();
        String str = "";

        helper(n,0,0,str,ans);
        return ans;
        
    }
}