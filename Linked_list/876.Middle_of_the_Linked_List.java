class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null)
        {
            ListNode net = cur.next;
            cur.next=prev;
            prev=cur;
            cur=net;

        }
        return prev;
    }
}
