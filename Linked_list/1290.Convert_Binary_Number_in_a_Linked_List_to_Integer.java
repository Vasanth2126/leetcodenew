
class Solution {
    public int getDecimalValue(ListNode head) {
        String a="";
        ListNode temp=head;
        while(temp!=null)
        {
            a+=String.valueOf(temp.val);
            temp=temp.next;
        }
        return Integer.parseInt(a,2);
    }
}
