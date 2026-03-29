class Solution {

    String rev(String s){
        String res="";

        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }

        return res;
    }

    public String reverseWords(String s) {
        String word="";
        String res="";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                word=rev(word);
                res+=word+" ";
                word="";
            }
            else{
                word+=s.charAt(i);
            }
        }
           word=rev(word);
            res+=word;

            return res;
    }
}
