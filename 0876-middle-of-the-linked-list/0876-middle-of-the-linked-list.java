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
    public ListNode middleNode(ListNode head) {
//         if(head==null){
//             return head;
//         }
        
//         int size=0;
//         ListNode temp=head;
//         while(temp!=null){
//             size++;
//             temp=temp.next;
//         }
        
//         temp=head;
//         int num=size/2;
//         while(num>0){
//             temp=temp.next;
//             num--;
//         }
        
//         return temp;
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        
        return slow;
        
    }
}