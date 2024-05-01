class Solution {
    
    public Node arrangeCV(Node head){
        //write code here and return the head of changed linked list
        Node v=new Node('a');
        Node c=new Node('a');
        Node start=head;
        Node vp=v;
        Node cp=c;
        while(start!=null){
            if(start.data=='a'|| start.data=='e' || start.data=='i' || start.data=='o' || start.data=='u')
            {
                vp.next=new Node(start.data);
                vp=vp.next;
            }
            else{
                cp.next=new Node(start.data);
                cp=cp.next;
            }
            start=start.next;
        }
        start=v;
        // while(start.next!=null)
        // {
        //     start=start.next;
        // }
        vp.next=c.next;
        return v.next;
    }
}