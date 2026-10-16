/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static void inorder(TreeNode root,List<Integer> ans){
        Stack<TreeNode> st = new Stack<>();

        TreeNode node = root;

        while(!st.empty() || node!=null){

            if(node!=null){
                st.push(node);

                node = node.left;

            }

            else{
                TreeNode temp = st.pop();
                ans.add(temp.val);
                node = temp.right;
            }

        }


    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        return ans;
    }
}