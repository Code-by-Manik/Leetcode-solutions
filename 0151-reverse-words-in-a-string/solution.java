class Solution {
    public String reverseWords(String s) {
        Stack<String> st=new Stack<>();
        String result="";
        String word="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(word.length()>0){
                    st.push(word);
                }
                word="";
            }
            else{
                word+=s.charAt(i);
            }
        }

         if(word.length()>0){
                    st.push(word);
                }

        while(!st.empty()){
            result+=st.pop();
            if(!st.empty()){
                result+=" ";
            }
        }

        return result;
    }
}
