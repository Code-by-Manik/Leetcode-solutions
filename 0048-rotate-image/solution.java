class Solution {

    void rev(int arr[][]){

          for(int i=0;i<arr.length;i++){
        
        int left=0;
        int right=arr[0].length-1;
     while(left<right){
        int temp = arr[i][left];
        arr[i][left] = arr[i][right];
        arr[i][right] = temp;
        left++;
        right--;
     }
          }
    }
    public void rotate(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

       
        for(int i=0;i<r;i++){
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

      
            rev(matrix);



    }
}
