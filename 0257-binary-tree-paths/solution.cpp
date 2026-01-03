/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:

    void preorder(TreeNode* root,vector<string> &arr,string path){
        if(!root) return;

        path+=to_string(root->val);

        if(!root->left && !root->right){
            arr.push_back(path);
        }

       path+="->";

        preorder(root->left,arr,path);
        preorder(root->right,arr,path);
    }

    vector<string> binaryTreePaths(TreeNode* root) {

        vector<string> ans;

        preorder(root,ans,"");

        return ans;


        
    }
};
