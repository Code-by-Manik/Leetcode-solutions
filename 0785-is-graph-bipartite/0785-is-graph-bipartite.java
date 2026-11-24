class Solution {

    static boolean bfs(int[][] adj,Boolean color[],int src){
     Queue<Integer> q = new LinkedList<>();

     if(color[src] == null) color[src] = true;
     q.add(src);
     while(!q.isEmpty()){
        int front = q.poll();
     for(int i=0;i<adj[front].length;i++){
        int nbr = adj[front][i];
        if(color[nbr]==null){
        q.add(nbr);
            color[nbr] = !color[front];
        }
        else if(color[nbr] == color[front]) return false;
     }
    }
     return true;
        
    }
    public boolean isBipartite(int[][] adj) {
        Boolean color[] = new Boolean[adj.length];
        // color[0] = true;
        for(int i=0;i<adj.length;i++){
            if(!bfs(adj,color,i)){
                return false;
            }
        }
        return true;
    }
}