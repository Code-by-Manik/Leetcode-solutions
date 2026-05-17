class Solution {
    public int[] concatWithReverse(int[] nums) {

        Stack<Integer> st = new Stack<>();
        int size = nums.length;

        int ans[] = new int[size*2];

        for(int i:nums){
            st.push(i);
        }
        int k = 0;
        for(int i : nums){
            ans[k++] = i;
        }
        while(!st.isEmpty()){
            ans[k++] = st.pop();
        }
        return ans;

    }
}
