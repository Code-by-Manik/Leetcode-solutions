class Solution {
    public String longestCommonPrefix(String[] strs) {

        int min = strs[0].length();
        for(String i: strs){
            if(i.length()<min){
                min = i.length();
            }
        }

        String pre = "";


        for(int i=0;i<min;i++){
            String str = strs[0];
            boolean check = true;
            
            for(String s:strs){
                if(s.charAt(i) != str.charAt(i)){
                    check = false;
                }
                
            }
            if(check){
                pre+=str.charAt(i);
            }
            else{
                break;
            }

        }
        return pre;
        
    }
}