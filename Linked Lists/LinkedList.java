//This program gives an example of how Linked Lists work
public class LinkedList {
	
	static class Node
	{
		int data; //Data of current Node
		Node next; //Pointer to next node
		
		Node (int d)
		{
			this.data=d;
			next=null;
		}
	
	}
	
	Node head; //Head of List

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create new linked list
		LinkedList listt=new LinkedList();
		
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		
		listt.head=n1;
		n1.next=n2;
		n2.next=n3;
		
		System.out.println("Head points to n1, which stores data: "+listt.head.data);
		System.out.println("n1 points to n2, which stores data: "+n1.next.data);
		System.out.println("n2 points to n3, which stores data: "+n2.next.data);
		System.out.println("n3 is the last node, so it points to: "+ n3.next);
	}

}
