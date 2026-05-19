class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> arr = new ArrayList<>();
        List<Integer> ans = new ArrayList<>(); 
        for(int i=1;i<=n;i++){
            arr.add("" + i);
        }

        Collections.sort(arr);

        for(String i:arr){
            int a = Integer.parseInt(i);
            ans.add(a);
        }
        return ans;
    }
}
