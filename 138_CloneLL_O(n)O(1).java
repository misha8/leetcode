/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    public Node copyRandomList(Node head) {
         if(head==null){
            
            return null;
        }
        
        Node ptr=head,tmp=null;
        
        while(ptr!=null){
            
            tmp=ptr.next;
            
            ptr.next=new Node(ptr.val);
            
            ptr.next.next=tmp;
            ptr=tmp;
            
        }
        
    ptr=head;
    
    while(ptr!=null && ptr.next!=null){
        
        if(ptr.next!=null){
            
            ptr.next.random=ptr.random!=null?ptr.random.next:null;
            
            
        }
        ptr=ptr.next!=null?ptr.next.next:null;
        
    }
     
     ptr=head;
     Node head2=ptr.next;
     Node ptr2=head2;
     while(ptr!=null && ptr2!=null){
         
         tmp=ptr.next;
         ptr.next=ptr2.next;
         ptr=ptr.next!=null?ptr.next:null;
         
         ptr2.next=ptr!=null?ptr.next:null;
         
         ptr2=ptr2.next!=null?ptr2.next:null;
         
     }
     return head2;
    }
}
