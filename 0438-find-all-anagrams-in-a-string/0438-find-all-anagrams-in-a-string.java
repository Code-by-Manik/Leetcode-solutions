class Solution {
    static boolean check(String a,String b){
        char freq[] = new char[26];

        for(char i:a.toCharArray()){
            freq[i - 'a']++;
        }
        for(char i:b.toCharArray()){
            freq[i - 'a']--;
        }

        for(int i:freq){
            if(i!=0) return false;
        }
        return true;

    }
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<=s.length() - p.length();i++){
            if(check(s.substring(i,i + p.length()),p)){
                ans.add(i);
            }
        }
        return ans;
        
    }
}