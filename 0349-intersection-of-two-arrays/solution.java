class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> s1 = new HashSet<>();

    int size = 0;
    if(nums1.length<nums2.length){
        size = nums1.length;
    }
    else{
        size = nums2.length;
    }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i: nums1){
            s1.add(i);

        }

         Set<Integer> s2 = new HashSet<>();
        for(int i: nums2){
            s2.add(i);

        }

        int j=0;

        for(int i:s1){
            if(s2.contains(i)){
               ans.add(i);
            }
        }

       int arr[] = new int[ans.size()];


    for(int i:ans){
        arr[j++] = i;
    }

    return arr;
        
    }
}
