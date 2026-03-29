class Solution {

    int search(char c,String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char i: map.keySet()){
            if(map.get(i)==1){
                return search(i,s);
            }
        }

        return -1;
    }
}
