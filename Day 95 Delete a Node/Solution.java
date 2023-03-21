

/* Linklist node structure
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
/*You are required to complete below method*/
class GfG
{
    Node deleteNode(Node head, int x)
    {
       Node temp;
	  temp=head;
	  
	  int len=0;
	  
	  while(temp!=null){
	      len++;
	      temp=temp.next;
	  }
	  
	  if(x==1)
	  {
	      head=head.next;
	      return head;
	  }
	  else {
	      temp=head;
	      for(int i=1;i<x-1;i++)
	      {
	          temp=temp.next;
	      }
	      temp.next=temp.next.next;
	      
	      
	      
	  }
	return head;

    }
}
