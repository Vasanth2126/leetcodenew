/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        while(temp!=null)
        {
            ListNode var=headB;
            while(var!=null)
            {
                if(temp==var)
                {
                    return temp;
                }
                var=var.next;
            }
            temp=temp.next;
        }
        return null;
    }
}
