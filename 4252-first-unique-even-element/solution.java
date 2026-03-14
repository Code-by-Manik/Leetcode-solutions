class Solution {
    public int firstUniqueEven(int[] nums) {

        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i:map.keySet()){
            if(i%2==0){
                if(map.get(i)==1){
                    return i;
                }
            }
        }
        return -1;
    }
}
