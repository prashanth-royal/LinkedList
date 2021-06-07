
public class LinkedListDemo {

	Node head;
	
	static class Node {
		int data;
		Node next;
		Node (int d)
		{
			data = d;
			next = null;
		}
	}

	void printList() {
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void add(int data) {
		
		Node new_node = new Node(data);
		new_node.next = null;
		if(head == null)
		{
			head = new_node;
		} 
		else 
		{
			Node temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next = new_node;
			
		}
	}
	public static void main(String[] args) {
	
		LinkedListDemo list = new LinkedListDemo();
		
	//	list.head = new Node(1);
	//	Node second = new Node(2);
	//	Node third = new Node(3);
	//	Node fourth = new Node(4);
		
	//	list.head.next = second;
	//	second.next = third;
	//	third.next = fourth;
		
		list.add(52);
		list.add(850);
		list.add(6);
		list.add(520);
		list.add(79);
		
		list.printList();
	}			
}
