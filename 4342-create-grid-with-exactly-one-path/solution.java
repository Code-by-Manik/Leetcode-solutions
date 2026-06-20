class Solution {
    public String[] createGrid(int m, int n) {

        int idx=0;
        String arr[] = new String[m];

        for(int i=0;i<m;i++){
            String row = "";

            for(int j=0;j<n;j++){
                if(i==0){
                    row+=".";
                }
                else{
                    if(j!=n-1){
                        row+="#";
                    }
                    else{
                        row+=".";
                    }
                }
            }

            arr[idx++] = row;


        }

        return arr;
        
    }
}
