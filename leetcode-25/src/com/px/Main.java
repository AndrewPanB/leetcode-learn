/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp1 = pre;
        ListNode temp2 = pre;
        while(temp2.next !=null){
            for(int i=0;i<k && temp2!=null; i++ ){
                temp2 = temp2.next;
            }
            if(temp2==null){
                break;
            }
            ListNode start = temp1.next;
            ListNode next = temp2.next;
            temp2.next = null;
            temp1.next = reverse(start);
            
            start.next = next;
            temp1 = start;
            temp2 = start;
      
        }
        return pre.next;
    }
    
    private ListNode reverse(ListNode node){
        ListNode ln = null;
        ListNode n = null;
        while(node!=null){
            n = node.next;
            node.next = ln;
            ln = node;
            node = n;
        }
        return ln;
    }
}
