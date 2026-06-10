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

class Solution 
{
    public void reorderList(ListNode head) 
    {
        if (head == null || head.next == null) return;

        // Step 1: Find the middle using slow & fast pointers
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // slow is now the start of the second half
        ListNode l2 = slow.next; 
        slow.next = null; // Sever the link to separate the two halves
        
        ListNode l1 = head;

        // Step 2: Reverse the second half (Your exact logic, which is perfect!)
        ListNode prev = null;
        ListNode curr = l2;

        while (curr != null)
        {
            ListNode temp = curr.next;
            curr.next = prev; 
            prev = curr;
            curr = temp;
        }
        l2 = prev; // l2 now points to the head of the reversed second half

        // Step 3: Merge the two lists alternately
        while (l2 != null)
        {
            ListNode next1 = l1.next;
            ListNode next2 = l2.next;
            
            l1.next = l2;
            l2.next = next1;

            l1 = next1;
            l2 = next2;
        }
    }
}

