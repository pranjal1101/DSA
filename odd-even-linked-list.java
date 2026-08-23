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
    public ListNode oddEvenList(ListNode h){
        if(h==null||h.next==null)return h;
        ListNode o=h,e=h.next,x=e;
        while(e!=null&&e.next!=null){
            o.next=e.next;
            o=o.next;
            e.next=o.next;
            e=e.next;
        }
        o.next=x;
        return h;
    }
}