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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head.next == null)
        {
            return null;
        }
        
        ListNode temp = head;
        ListNode temp2 = head;
        int curr = 0;
        
        while(temp != null)
        {
            curr++;
            temp = temp.next;
        }
        
        ListNode prev = null;
        for(int i = 0; i < curr - n; i++)
        {
            prev = temp2;
            temp2 = temp2.next;
        }
        
        if(temp2 == head)
        {
            head = head.next;
        }
        else
        {
            prev.next = temp2.next;
        }
 
        return head;
    }
}