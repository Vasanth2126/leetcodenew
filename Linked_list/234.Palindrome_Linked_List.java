class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode front=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode cur=slow;
        while(cur!=null)
        {
            ListNode node=cur.next;
            cur.next=prev;
            prev=cur;
            cur=node;
        }
        while(prev!=null)
        {
            if(prev.val!=front.val)
            {
                return false;
            }
            prev=prev.next;
            front=front.next;
        }
        return true;
    }
}
