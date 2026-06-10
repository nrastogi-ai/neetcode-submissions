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
    public boolean hasCycle(ListNode head) 
    {
        boolean flag = false;
       
        if (head == null) 
        return false;
        else
        {
             ListNode c1= head;
        ListNode c2= head.next;
        while (c2 != null && c2.next != null)
        {
            if (c1 !=c2)
            {
                c1 = c1.next;
                c2= c2.next;
                c2= c2.next;
            }
            else
            {
                flag = true;
                break;
            }
        }
        return flag;
        }
    }
}
