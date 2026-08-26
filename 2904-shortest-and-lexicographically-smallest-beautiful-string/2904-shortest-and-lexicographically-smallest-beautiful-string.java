class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int min = 1000;
        char str[] = s.toCharArray();
        int i=0;

        int j=0;

        int len = 0;
        int sum=0;
        boolean check = false;
        String ans = "";

        while(j<s.length()){
            if(str[j]=='1'){
                sum++;
            }
                if(sum==k){
                    while(i<=j && str[i] == '0'){
                        i++;
                    }
                    len = j-i+1;
                    check = true;
                String curr = s.substring(i,j+1);
                    if(len<min){
                         min = len;
                         ans = s.substring(i,j+1);
                    }
                    else if(len == min && curr.compareTo(ans)<0){
                        ans = curr;
                    }

                }

          
            while(sum>=k){
                if(str[i]=='1') sum--;
                i++;
            }

            j++;

        }   
    

    if(!check) return "";
    
    return ans;
    }

}