class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();

        for(String i:tokens){
            if(i.equals("+") ||
                i.equals("-")||
                i.equals("*") ||
                i.equals("/")
            ){

            int a = Integer.parseInt(st.pop());
            int b = Integer.parseInt(st.pop());

            int ans = 0;

            if(i.equals("+")) ans = b + a;
            if(i.equals("-")) ans = b - a;
            if(i.equals("*")) ans = b * a;
            if(i.equals("/")) ans = b / a;

            st.push(""+ans);
            }

            else{
                st.push(i);
            }

        }

      return Integer.parseInt(st.pop());


    }
}