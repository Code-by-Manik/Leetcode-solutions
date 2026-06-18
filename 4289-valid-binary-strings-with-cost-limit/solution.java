class Solution {

    static int count(String s){
        int t = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                t+=i;
            }
        }
        return t;
    }

    String binary(int num,int len){
        int org = num;
        int length = len;
        StringBuilder sb = new StringBuilder();

        while(length-- > 0){
            int digit = num%2;
           sb.append(digit);
            num/=2;
        }
        return sb.reverse().toString();
    }

    public List<String> generateValidStrings(int n, int k) {
        List<String> ans = new ArrayList<>();
        for(int i=0;i<Math.pow(2,n);i++){
            String str = binary(i,n);

            int total = count(str);

        if(!str.contains("11") && total <= k){
            ans.add(str);
        }


        }

        return ans;
    }
}
