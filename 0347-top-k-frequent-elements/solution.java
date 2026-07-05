class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int arr[]  = new int[k];

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

    // int max = 0;
    int ans = -1;
    int idx = 0;
    while(k-->0){
        int max = 0;
    for(int i : map.keySet()){
        if(map.get(i) > max){
            max = map.get(i);
            ans = i;
        }

    }
    arr[idx++] = ans;
    map.remove(ans);

    }

    return arr;
        
    }
}
