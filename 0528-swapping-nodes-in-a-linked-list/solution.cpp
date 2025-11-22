/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* swapNodes(ListNode* head, int k) {
        if(!head) return NULL;

        ListNode* temp=head;
        int size=0;

        while(temp){
            temp=temp->next;
            size++;
        }

        
      if (k > size) return head;

       int idxL=size-k+1;


ListNode* temp1=head;
ListNode* temp2=head;


for(int i=1;i<k;i++){
    temp1=temp1->next;
}

for(int i=1;i<idxL;i++){
    temp2=temp2->next;
}

int data = temp1->val;
        temp1->val = temp2->val;
        temp2->val = data;

        return head;
        
    }

};
