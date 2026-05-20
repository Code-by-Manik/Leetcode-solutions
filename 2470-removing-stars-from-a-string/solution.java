class Solution {
    public String removeStars(String s) {

        Stack<Character> st = new Stack<>();

        for(char i:s.toCharArray()){
            if(i=='*' && !st.isEmpty()){
                st.pop();
            }
            else{
                st.push(i);
            }
        }
        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
        
    }
}
