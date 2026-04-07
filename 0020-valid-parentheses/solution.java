class Solution {
    public boolean isValid(String s) {

     if(s.length()%2!=0) return false;

    Stack<Character> st= new Stack<>();

    for(char i : s.toCharArray()){
        if(i=='(' || i=='{' || i=='['){
            st.push(i);
        }
        else{

            if(st.empty()) return false;
            char top=st.peek();
            st.pop();
            if((i=='}' && top!='{') ||
                (i==')' && top!='(') ||
                (i==']' && top!='[')
            ) return false;
        }


        
    }
        if(st.empty()) return true;
        return false;




    }
}
