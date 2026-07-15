class Solution {
    public char findTheDifference(String s, String t) {

        Map<Character,Integer> map = new HashMap<>();

        for(char i : s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(char i : t.toCharArray()){
            map.put(i,map.getOrDefault(i,0)-1);
        }
       
       for(char i:map.keySet()){

            if(map.get(i) == -1){
                return i;
            }

       }
       return 'a';
    }
}