class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st = new Stack<>();
        Set<Character> set = new HashSet<>();
        String ans = "";

        int check[] = new int[26];

        for(int i=0;i<s.length();i++){
            check[s.charAt(i)-'a'] = i;
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

 if(!set.contains(ch)){
            while(!st.isEmpty() && st.peek() > ch && check[st.peek() - 'a']>i){
                set.remove(st.peek());
                st.pop();
            }
       
           
            st.push(ch);
            set.add(ch);
        }
        }

        while(!st.isEmpty()){
            ans+=st.peek();
            st.pop();
        }
        StringBuilder sb = new StringBuilder(ans);

        return sb.reverse().toString();
    }
}