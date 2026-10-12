class Solution {
    static void helper(String digit,int idx,String[] map,String output,List<String> res){

        if(idx==digit.length()){
            res.add(output);
            return;
        }

        String str = map[digit.charAt(idx) - '0'];

        for(int i=0;i<str.length();i++){
            output+=str.charAt(i);
            helper(digit,idx+1,map,output,res);
            output = output.substring(0,output.length()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        String map[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        helper(digits,0,map,"",result);

        return result;
    }
}