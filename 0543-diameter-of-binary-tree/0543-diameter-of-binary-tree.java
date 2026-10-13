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

    static int depth(TreeNode root){
        if(root==null) return 0;

        return 1 + Math.max(depth(root.left),depth(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;

        int left = depth(root.left);

        int right = depth(root.right);

        int cur_max = left + right;

        int L_diameterOfBinaryTree = diameterOfBinaryTree(root.left);
        int R_diameterOfBinaryTree = diameterOfBinaryTree(root.right);

        return Math.max(cur_max,Math.max(L_diameterOfBinaryTree,R_diameterOfBinaryTree));


    }
}