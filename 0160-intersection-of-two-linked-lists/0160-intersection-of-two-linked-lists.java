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
        if(headA==null || headB==null) return null;

        ListNode tempA = headA;
        ListNode tempB = headB;

        int sizeA = 0;
        int sizeB = 0;

        while(tempA!=null || tempB!=null){
            if(tempA!=null){
                sizeA++;
                tempA = tempA.next;
            }
            

            if(tempB!=null){
                sizeB++;
                tempB = tempB.next;
            }

        }

        tempA = headA;
        tempB = headB;

        int diff = 0;

        if(sizeA>sizeB){
            diff = sizeA - sizeB;
        }
        else{
            diff = sizeB - sizeA;
        }

        
            if(sizeA > sizeB){
                while(diff-->0){
                    tempA = tempA.next;


                }
            }
            else{
                while(diff-->0){
                    tempB = tempB.next;
 
                }

            }

        
        while(tempA!=null && tempB!=null){
            if(tempA == tempB){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return null;
        
    }
}