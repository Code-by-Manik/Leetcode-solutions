class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for(char i:s.toCharArray()){
            if(set.contains(i)){
                return i;
            }
            set.add(i);
        }
      return '9';
    }
}
