/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static int deci(String s){
       int base=1;
       int total=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == '1'){
                total+=base;
            }
            base*=2;
        }
        return total;
    
     
    }
    public int getDecimalValue(ListNode head) {

        int n=0;
        String binary = "";

        ListNode curr = head;
        while(curr!=null){
            binary+=""+curr.val;
            curr = curr.next;
        }
        int des = deci(binary);
        return des;
        
    }
}