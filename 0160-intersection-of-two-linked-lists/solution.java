/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int sizeA=0;
        ListNode tempA=headA;

        while(tempA!=null){
            sizeA++;
            tempA=tempA.next;
        }
        

        int sizeB=0;

        ListNode tempB=headB;

        while(tempB!=null){
            sizeB++;
            tempB=tempB.next;
        }

        int diff=0;
        tempA=headA;
        tempB=headB;

        if(sizeA>sizeB){
            diff=sizeA-sizeB;
            for(int i=0;i<diff;i++){
                tempA=tempA.next;
            }

        }

        else{
            diff=sizeB-sizeA;

         for(int i=0;i<diff;i++){
                tempB=tempB.next;
            }
        }


        while(tempA!=null || tempB!=null){

             if(tempA==tempB){
                return tempA;
             }

            tempA=tempA.next;
            tempB=tempB.next;

           
        }



    return null;

        
    }
}
