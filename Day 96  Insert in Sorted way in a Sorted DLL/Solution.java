

/*class of the node of the DLL is as
class Node {
	int data;
    Node prev, next;
    Node(int item)
    {data = item;
        next = prev = null;
    }
}
*/
// function should insert a new node in sorted way in
// a sorted doubly linked list
class GfG
{
    public static Node insertWhenOnlyElement(Node head,int x)
    {
        Node temp=new Node(x);
        if(head.data>x)
        head=insertAtHead(head,x);
        else
        {
            head.next=temp;
            temp.prev=head;
        }
        return head;
    }
    
    public static Node insertAtHead(Node head,int x)
    {
        Node temp=new Node(x);
        temp.next=head;
        head.prev=temp;
        head=temp;
        return head;
    }
    
    public static Node insertAtAnyPlace(Node head,int x)
    {
        Node temp=new Node(x),curr=head;
        while(curr.next!=null&&curr.next.data<x)
        curr=curr.next;
        if(curr.next==null)
        {
            curr.next=temp;
            temp.prev=curr;
        }
        else
        {
            curr.next.prev=temp;
            temp.next=curr.next;
            temp.prev=curr;
            curr.next=temp;
        }
        return head;
    }
    
    public static Node sortedInsert(Node head, int x)
    {
        // add your code here
        
        if(head.next==null)
        head=insertWhenOnlyElement(head,x);
        else if(head.data>x)
        head=insertAtHead(head,x);
        else
        head=insertAtAnyPlace(head,x);
        return head;
    }
}
