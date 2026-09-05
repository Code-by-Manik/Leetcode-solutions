class Solution {
    public String frequencySort(String s) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        Map<Character,Integer> map = new HashMap<>();

        for(char i : s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(char i:map.keySet()){
            pq.add(map.get(i));
        }

        String ans = "";

        while(!pq.isEmpty()){
            int n = pq.poll();

            for(char i:map.keySet()){
                if(map.get(i) == n){
                    while(n-->0){
                        ans+=i;
                    }
                    map.remove(i);
                    break;
                }
            }
        }

        return ans;
        
    }
}