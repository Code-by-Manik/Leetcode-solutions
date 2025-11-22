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
    ListNode* rotateRight(ListNode* head, int k) {

        if(!head) return NULL;

        ListNode* temp=head;
        int size=1;

        while(temp->next){

            size++;

            temp=temp->next;

        }
        ListNode* tail=temp;

        k=k%size;

        temp=head;

       int idx=size-k;

    for(int i=0;i<idx-1;i++){
        temp=temp->next;
    }

    tail->next=head;

    head=temp->next;

    temp->next=NULL;


    return head;





        

        
        
    }
};
