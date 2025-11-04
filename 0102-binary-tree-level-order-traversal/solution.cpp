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

int levels(TreeNode* root){
    if(!root) return 0;

    int lmax=levels(root->left);
   int  rmax=levels(root->right);

    return 1+max(lmax,rmax);

}

    void printN(vector<int> &arr,TreeNode* root,int level,int curr=1){

      
        if(!root) return;

        if(curr==level){
            arr.push_back(root->val);
            return;
        }

        printN(arr,root->left,level,curr+1);
        printN(arr,root->right,level,curr+1);


    }

    void lorder(TreeNode* root,  vector<vector<int>> &ans){
       
         int n=levels(root);


         for(int i=1;i<=n;i++){
            vector<int> arr;

            printN(arr,root,i,1);

            ans.push_back(arr);

        

         }


    }



    vector<vector<int>> levelOrder(TreeNode* root) {

        vector<vector<int>> ans;

        lorder(root,ans);

        return ans;

        
    }
};
