class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     Arrays.sort(nums1);
     Arrays.sort(nums2);

    Set<Integer> set = new HashSet<>();

    int i=0;
    int j=0;

    while(i<nums1.length && j<nums2.length){
        if(nums1[i]<nums2[j]) i++;
        else if(nums2[j] < nums1[i]) j++;
        else set.add(nums1[i++]);
    }

    int idx=0;
    int ans[] = new int[set.size()];
    for(int k:set){
        ans[idx++] = k;
    }
    return ans;

    }
}