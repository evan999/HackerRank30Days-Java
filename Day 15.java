public static  Node insert(Node head,int data) {
	//Complete this method
	// Solved with Alida and Jim
	
	if(head == null) {
			head = new Node(data);
			return head;
	}
	
	if(head.next == null){
			head.next = new Node(data);
	}
	else {
			insert(head.next, data);
	}
	
	return head;       
}