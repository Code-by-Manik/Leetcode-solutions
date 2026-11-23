class Solution {

    static boolean dfs(Map<Integer,ArrayList<Integer>> map,int front,int target,boolean seen[]){

        if(seen[front]) return false;
        if(front == target) return true;

        seen[front] = true;

        for(int i=0;i<map.get(front).size();i++){
            if(!seen[map.get(front).get(i)]){
                if(dfs(map,map.get(front).get(i),target,seen)){
                    return true;
                }

            }
        }
        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];

            map.get(u).add(v);
            map.get(v).add(u);



        }

        boolean seen[] = new boolean[n];

        return dfs(map,source,destination,seen);

    }
}