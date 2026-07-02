class Solution {

    static void sets(int arr[],int index,List<Integer> subset,List<List<Integer>> list){
        if(index >= arr.length){
            list.add(new ArrayList<>(subset));
            return;
        }
    subset.add(arr[index]);

    sets(arr,index+1,subset,list);

    subset.remove(subset.size()-1);

    sets(arr,index+1,subset,list);

    }
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
       int index = 0;

        sets(arr,0,subset,list);

    return list;

    }
}
