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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode curr=head;
        int length=0;  
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        
        int buckets=length/k;
        int rem=length%k;
        
        ListNode[] ans=new ListNode[k];
        curr=head;
      
        
        for(int i=0;i<k;i++){
            ans[i]=curr;
            ListNode prev=null;
            for(int j=1;j<=buckets+(rem>0?1:0);j++){
                prev=curr;
                curr=curr.next;
            }
            if(prev!=null)
            prev.next=null;
            rem--;
        }
        
        return ans;
    }
}