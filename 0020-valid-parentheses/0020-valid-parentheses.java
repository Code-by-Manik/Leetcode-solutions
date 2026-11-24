class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        Stack<Character> st = new Stack<>();

        char str[] = s.toCharArray();

        int i=0;
        while(i<s.length()){
            if(str[i] == '('||str[i] == '['||str[i] == '{'){
                st.push(str[i]);
            }
            else{
                if(st.empty()) return false;
                char top = st.pop();

                if((top=='(' && str[i] != ')')||(top=='{' && str[i] != '}')||(top=='[' && str[i] != ']')){
                    return false;

                }
            }
            i++;
        }

        if(!st.empty()) return false;
        return true;
    }
}