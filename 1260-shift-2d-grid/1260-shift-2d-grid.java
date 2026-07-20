class Solution {

    static void rev(List<Integer> list,int s,int e){
        Collections.reverse(list.subList(s,e));

    }

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int size = m*n;

        k = k%size;

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                list.add(grid[i][j]);
            }
        }


    rev(list,0,size);
    rev(list,0,k);
    rev(list,k,size);

    List<List<Integer>> ans = new ArrayList<>();


    for(int i=0;i<size;i+=n){
        
        ans.add(list.subList(i,i+n));    
        
    }


    return ans;

        


        
    }
}