/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) 
    {
        if(head == null)
        {
            return null;
        }
        
        Node newHead = new Node(head.val, null, null);
        
        Node temp = head.next;
        Node newTemp = newHead;
        while(temp != null)
        {
            Node newNode = new Node(temp.val, null, null);
            newTemp.next = newNode;
            newTemp = newTemp.next;
            temp = temp.next;
        }
        
        Node temporary = head;
        Node newTemporary = newHead;
        while(temporary != null && newTemporary != null)
        {
            System.out.println(temporary.val + " " + newTemporary.val);
            findRandom(head, newHead, newTemporary, temporary);
            temporary = temporary.next;
            newTemporary = newTemporary.next;
        }
        
        return newHead;
    }
    
    public void findRandom(Node head, Node newHead, Node current, Node headCurrent)
    {
        Node temp = head;
        Node newTemp = newHead;
        
        if(headCurrent.random == null)
        {
            current.random = null;
            return;
        }
        
        while(temp != null && newTemp != null)
        {
            if(temp == headCurrent.random)
            {
                current.random = newTemp;
                break;
            }
            
            temp = temp.next;
            newTemp = newTemp.next;
        }
    }
    
}