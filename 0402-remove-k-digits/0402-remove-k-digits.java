class Solution {
    public String removeKdigits(String num, int k) {
        // if(num.length()==1 && k==1) return "0";
        Stack<Character> st = new Stack<>();
        boolean inc = true;
        for(char i:num.toCharArray()){

            while(!st.empty() && st.peek()>i && k>0){
                    st.pop();
                    // st.push(i);
                    k--;
            }  

            st.push(i);     
       
        }

        
        while(!st.empty() && k>0){
                st.pop();
                k--;
            }
         
        System.out.println(k);
        StringBuilder sb = new StringBuilder();

        while(!st.empty()){
            sb.append(st.pop());
        }
        if(sb.length()==0) return "0";
        
         sb.reverse();

        int idx=0;
        while(idx<sb.length() && sb.charAt(idx) == '0'){
            idx++;
        }

        String ans = sb.substring(idx);
        if(idx==sb.length()) return "0";

        return ans;
        
    }
}