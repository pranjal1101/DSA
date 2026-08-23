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
class Solution{
    public ListNode addTwoNumbers(ListNode a,ListNode b){
        a=reverse(a);
        b=reverse(b);
        int carry=0;
        ListNode head=null;

        while(a!=null||b!=null||carry>0){
            int x=0,y=0;
            if(a!=null) x=a.val;
            if(b!=null) y=b.val;

            int sum=x+y+carry;
            carry=sum/10;

            ListNode node=new ListNode(sum%10);
            node.next=head;
            head=node;

            if(a!=null) a=a.next;
            if(b!=null) b=b.next;
        }
        return head;
    }

    ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}