package LinkedListDemo;

public class CreationPrintingOfLL {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		 
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
		
		public void printLL()
		{
			Node n = head;
			while(n!=null)
			{
				System.out.println(n.data);
				n = n.next;
			}
		}
		
	
	public static void main(String[] args) {
		
		CreationPrintingOfLL  ll  = new CreationPrintingOfLL();
		
		//Creation of LL
		Node fNode = ll.new Node(10);
		ll.head = fNode;
		
		Node sNode = ll.new Node(20);
		fNode.next = sNode;
		
		Node tNode = ll.new Node(30);
		sNode.next = tNode;
		
		ll.printLL();
		
		
		
		
	}

	

}
