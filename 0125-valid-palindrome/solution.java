class Solution {


    public boolean isPalindrome(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                res.append((char)(s.charAt(i)+32));
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                res.append(s.charAt(i));
            }

            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                res.append(s.charAt(i));   
            }
        }

        s=res.toString();

        int st=0;
        int ed=s.length()-1;

        while(st<ed){
            if(s.charAt(st)!=(s.charAt(ed))){
                return false;
            }
        st++;
        ed--;
        }
        return true;
        
    }
}
