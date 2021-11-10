/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) 
    {
        HashMap<ListNode, Boolean> hashmap = new HashMap<>();
        if(head == null)
        {
            return null;
        }
        
        while(head != null)
        {
            if(!hashmap.containsKey(head))
            {
                hashmap.put(head,true);
            }
            else{
                return head;
            }
            head = head.next;
        }
        
        return null;
    }
}