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
    static TreeNode iop(TreeNode root){
        root = root.left;
        while(root.right!=null){
            root = root.right;
        }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        if(root.val==key){
        if(root.left==null && root.right==null) return null;

        else if(root.left==null || root.right==null){
            if(root.left==null) return root.right;
            else return root.left;
            
        }
        else{
            TreeNode pred = iop(root);
            root.val = pred.val;
            root.left = deleteNode(root.left,pred.val);
        }
        }

        if(root.val > key) root.left = deleteNode(root.left,key);
        else root.right = deleteNode(root.right,key);

        return root;

    }
}