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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode res = new ListNode();
        ListNode temp = res;
        int carry=0;

        while(l1!=null && l2!=null)
        {
            int add = l1.val + l2.val+carry;
            carry = add/10;
            add = add%10;
            res.next = new ListNode(add) ;
            res = res.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null)
        {
            int add = l1.val +carry;
            carry = add/10;
            add = add%10;
            res.next = new ListNode(add) ;
            res = res.next;
            l1 = l1.next;
        }
                while(l2!=null)
        {
            int add = l2.val +carry;
            carry = add/10;
            add = add%10;
            res.next = new ListNode(add) ;
            res = res.next;
            l2 = l2.next;
        }
        
        if (carry!=0)
        res.next = new ListNode(carry) ;
        
        return temp.next;
    }
}
