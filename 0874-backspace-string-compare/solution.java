class Solution {

    static String edit(String str){

        Stack<Character> st = new Stack<>();


        for(char i:str.toCharArray()){

            if(st.isEmpty() && i=='#'){
                continue;
            }
           else if(!st.isEmpty() && i=='#'){
                st.pop();
            }
            else{
                st.push(i);
            }
        }

        String ans = "";
        while(!st.isEmpty()){
            ans+=st.pop();
        }
    return ans;

    }

    public boolean backspaceCompare(String s, String t) {

        s = edit(s);
        t = edit(t);

        return s.equals(t);
        
    }
}
