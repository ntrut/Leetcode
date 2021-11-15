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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        if(l1 == null && l2 == null)
        {
            return null;
        }
        if(l1 == null)
        {
            return l2;
        }
        if(l2 == null)
        {
            return l1;
        }
        
        ListNode head = l1;
        ListNode temp = l2;
        while(temp != null)
        {
            ListNode l1Temp = head;
            ListNode prev = null;
            while(l1Temp != null)
            {
                //beginning of the list
                if(temp.val <= l1Temp.val && prev == null)
                {
                    ListNode newNode = new ListNode(temp.val, l1Temp);
                    head = newNode;
                    break;
                }
                
                //middle of the list
                if(temp.val <= l1Temp.val && prev != null)
                {
                    ListNode newNode = new ListNode(temp.val, l1Temp);
                    prev.next = newNode;
                    break;
                }
                
                //end of the list
                if(l1Temp.next == null && temp.val > l1Temp.val)
                {
                    ListNode newNode = new ListNode(temp.val);
                    l1Temp.next = newNode;
                    newNode.next = null;
                    break;
                }
                
                prev = l1Temp;
                l1Temp = l1Temp.next;
            }
            
            temp = temp.next;
        }
        
        
        return head;
    }
    
}
