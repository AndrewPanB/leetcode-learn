package com.px;

//Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next ==null || k==0){
            return head;
        }
        ListNode tempNode = head;
        ListNode tempNode2 = head;
        ListNode countNode = head;
        int count =0;
        while(countNode != null){
            count++;
            countNode = countNode.next;
        }
        count = k%count;
        for(int i=0;i<count;i++){
            if(tempNode!=null && tempNode.next!=null){
                tempNode = tempNode.next;
            }else if(tempNode!=null && tempNode.next==null){
                tempNode = head;
            }else{
                return null;
            }
        }
        while(tempNode!=null && tempNode.next!=null){
            tempNode = tempNode.next;
            tempNode2 = tempNode2.next;
        }
        tempNode.next = head;
        ListNode first = tempNode2.next;
        tempNode2.next = null;
        return first;
    }
}