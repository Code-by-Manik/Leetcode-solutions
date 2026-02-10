class Solution {
    public int removeDuplicates(int[] nums) {
        
        Stack<Integer> st =new Stack<>();

        

        st.push(nums[nums.length-1]);

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]!=st.peek()){
                st.push(nums[i]);
            }
        }

        int i=0;

        while(st.size()!=0){
            nums[i++]=st.peek();
            st.pop();
        }

        return i;

    }
}
