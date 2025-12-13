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
    ListNode* mergeTwoLists(ListNode* head1, ListNode* head2) {

        if(!head1) return head2;
        if(!head2) return head1;

        if(!head1 && head2) return NULL; 


        ListNode* head;
        ListNode* temp1=head1;
        ListNode* temp2=head2;

        if(head1->val<=head2->val) {
            head=head1;
            temp1=head1->next;
        }
        else{
            head=head2;
            temp2=head2->next;
        }
        ListNode* temp=head;

        while(temp1&&temp2){
            if(temp1->val<=temp2->val){
                temp->next=temp1;
                temp1=temp1->next;
                temp=temp->next;
            }
            else{
                temp->next=temp2;
                temp2=temp2->next;
                temp=temp->next;
            }
        }


        while(temp1){
            temp->next=temp1;
            temp1=temp1->next;
            temp=temp->next;
        }

        while(temp2){
            temp->next=temp2;
            temp2=temp2->next;
            temp=temp->next;
        }



    return head;


    }
};
