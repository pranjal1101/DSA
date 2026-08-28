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
    public int pairSum(ListNode head) {
        ListNode s=head,e=head;
        while(e!=null && e.next!=null) {
            s=s.next;
            e=e.next.next;
        }
        ListNode prev=null;
        while(s!=null) {
            ListNode next=s.next;
            s.next=prev;
            prev=s;
            s=next;
        }
        int ans=0;
        while(prev!=null) {
            ans=Math.max(ans,head.val+prev.val);
            head=head.next;
            prev=prev.next;
        }
        return ans;
    }
}