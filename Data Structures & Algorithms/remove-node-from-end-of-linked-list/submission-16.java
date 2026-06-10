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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
    
        ListNode c= head;
        int count=0;
        while(c!=null)
        {
            count++;
            c=c.next;
        }
        if (count == n)
        {
            head = head.next;
        }
        else
        {
        int res = count - n ;
        c=head;
        while(c!=null)
        {
            res--;
            if (res==0)
            {
                break;
            }
            else
            {
                c=c.next;
            }
        }
        c.next = (c.next).next;
        }
        return head;
    }
}
