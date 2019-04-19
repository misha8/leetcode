/*  Complexity time: Max(m,n), space: Max(m,n)+1
*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        ListNode res=new ListNode(0);
        ListNode pres=res;
        ListNode p1=l1;
         ListNode p2=l2;
        int carry=0;
        while(p1!=null || p2!=null){
            
            int x=p1!=null?p1.val:0;
            int y=p2!=null?p2.val:0;
            
            int sum=x+y+carry;
            
            carry=sum/10;
            sum=sum%10;
            
            pres.next=new ListNode(sum);
            pres=pres.next;
            
            if(p1!=null){
                p1=p1.next;
            }
            if(p2!=null){
                p2=p2.next;
            }
        
        }
      if(carry>0){
          pres.next=new ListNode(carry);
      }
            
        return res.next;
        
        
    }
}
