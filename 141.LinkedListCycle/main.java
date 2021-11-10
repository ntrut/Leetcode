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
    public boolean hasCycle(ListNode head) 
    {
        if(head == null)
        {
            return false;
        }
        
        HashMap<ListNode, Boolean> hashmap = new  HashMap<ListNode, Boolean>();
        
        while(head.next != null)
        {
            if(!hashmap.containsKey(head))
            {
                hashmap.put(head, true);
            }
            else
            {
                return true;
            }
            
            head = head.next;
        }
        
        return false;
    }
}