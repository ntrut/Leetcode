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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> array = new ArrayList<>();
        while(head != null)
        {
            array.add(head.val);
            head = head.next;
        }
        
        int size = array.size() - 1;
        for(int i = 0; i < array.size(); i++)
        {
            
            if(array.get(i) != array.get(size))
            {
                return false;
            }
            size--;
        }
        
        return true;
    }
}