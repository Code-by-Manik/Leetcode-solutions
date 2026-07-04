class Solution {
    public int maxArea(int[] height) {
        int Marea = 0;

        int i=0;
        int j = height.length-1;

        while(i < j){
            int area = Math.min(height[i],height[j]) * (j-i);
            if(area > Marea) Marea = area;

             if(height[i] <= height[j] ){
                i++;
            }
            else{
                j--;
            }
        }
        return Marea;
    }
}
