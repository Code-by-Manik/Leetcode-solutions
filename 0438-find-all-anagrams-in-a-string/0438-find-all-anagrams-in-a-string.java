class Solution {

    static boolean check(String a,String b){
        // char aa[] = a.toCharArray();
        // char bb[] = b.toCharArray();

        // Arrays.sort(aa);
        // Arrays.sort(bb);

        // String A = new String(aa);
        // String B = new String(bb);

        // return A.equals(B);

        int arr[] = new int[26];

        for(char i : a.toCharArray()){
            arr[i-'a']++;
        }
        for(char i : b.toCharArray()){
            arr[i-'a']--;
        }

        for(int i:arr){
            if(i!=0) return false;
        }

        return true;

    }

    public List<Integer> findAnagrams(String s, String p) {

        int len = p.length();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<=s.length()-len;i++){
            if(check(s.substring(i,i+len),p)){
                list.add(i);
            }
        }
        return list;
    }
}