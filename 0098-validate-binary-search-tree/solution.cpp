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

    void inorder(TreeNode* root,vector<int> &arr){
        if(!root) return;

        inorder(root->left,arr);

        arr.push_back(root->val);

        inorder(root->right,arr);
    }

    bool isValidBST(TreeNode* root) {

        vector<int>arr;

        inorder(root,arr);

        int i=0;
        int j=1;

        while(j<arr.size()){
            if(arr[i]>=arr[j]) return false;

            i++;
            j++;
        }

        return true;
    }
};
