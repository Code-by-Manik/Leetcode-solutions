class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == ']'){
                String str = "";
                while(!st.empty() && st.peek()!='['){
                    str = st.pop() + str;
                }
                if(!st.empty())
                st.pop();
                String num="";
                while(!st.empty() && Character.isDigit(st.peek())){
                    num = st.pop() + num;
                }
                int n = Integer.parseInt(num);

                  for (int j = 0; j < n; j++) {
                for (int k = 0; k < str.length(); k++) {
                    st.push(str.charAt(k));
                }
            }
        }
            

            else{
                st.push(ch);
            }

        }

                String str = "";
                while(!st.empty()){
                    str = st.pop() + str;
                }

                ans+=str;
        return ans;


    }
}