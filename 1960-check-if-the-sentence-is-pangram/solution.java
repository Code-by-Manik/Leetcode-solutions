class Solution {
    public boolean checkIfPangram(String s) {
        String l = "qwertyuiopasdfghjklzxcvbnm";
        Set<Character> set = new HashSet<>();

        for(char i:l.toCharArray()){
            set.add(i);
        }
        for(char i:set){
            if(!s.contains(""+i)) return false;
        }
        return true;
    }
}
