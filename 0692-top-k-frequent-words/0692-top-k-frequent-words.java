class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        Map<String,Integer> map = new TreeMap<>();
        List<String> ans = new ArrayList<>();

        for(String i:words){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(String i:map.keySet()){
            q.add(map.get(i));
        }

        while(k>0){
            int val = q.poll();
            String str="";
            for(String i:map.keySet()){
                if(map.get(i)==val){
                    ans.add(i);
                    k--;
                    str = i;
                    break;
                }
            }
        map.remove(str);

        }
        // Collections.sort(ans);
        return ans;

    }
}