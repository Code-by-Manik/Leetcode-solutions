class NumArray {

    int []arr;

    public NumArray(int[] nums) {

      arr = nums;
        
    }
    
    public int sumRange(int left, int right) {
        int pre[] = new int[arr.length];

        pre[0] = arr[0];

        for(int i=1;i<arr.length;i++){
            pre[i] = arr[i] + pre[i-1];
        }

        if(left==0) return pre[right];

        return (pre[right] - pre[left-1]);


        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */