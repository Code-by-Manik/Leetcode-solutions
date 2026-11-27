class Solution {

    static int[] bfs(Map<Integer,ArrayList<Integer>> adj,int ind[],int ans[]){

        Queue<Integer> q = new LinkedList<>();
        int idx = 0;

        for(int i=0;i<ind.length;i++){
            if(ind[i] == 0){

                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int front = q.poll();
            ans[idx++] = front;
            for(int i=0;i<adj.get(front).size();i++){
                ind[adj.get(front).get(i)]--;

                if(ind[adj.get(front).get(i)] == 0){
                    q.add(adj.get(front).get(i));
                }

            }
        }

        if(idx!=ans.length) return new int[0];

        return ans;


    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer,ArrayList<Integer>> adj = new HashMap<>();

        for(int i=0;i<numCourses;i++){
            adj.put(i,new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        int ind[] = new int[adj.size()];

        for(int i:adj.keySet()){
            for(int j=0;j<adj.get(i).size();j++){
                ind[adj.get(i).get(j)]++;
            }
        }

        int ans[] = new int[adj.size()];

        return bfs(adj,ind,ans);



    }
}