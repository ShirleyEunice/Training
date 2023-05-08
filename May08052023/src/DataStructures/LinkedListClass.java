package DataStructures;

public class LinkedListClass {
	Node head;
	
	//creating nested Class
	static class Node{
		int value;
		Node next;
		
		public Node(int d) {
			value=d;
			next=null;
		}
		
	}
	
	//Insert at the end
		public void insertAtEnd(int value) {
			Node newNode = new Node(value);
			
			if(head == null) {
				head = newNode;
				return;
			}
			
			Node currentNode = head;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
		
	//Insert at the beginning
		
		public void insertAtBeginning(int value) {
			Node newNode = new Node(value);
			newNode.next = head;
			head = newNode;
		}
		
	//Insert at the middle
		
		public void insertAtMiddle(int value, int position) {
			Node newNode = new Node(value);
			
			if(position == 1) {
				newNode.next = head;
				head = newNode;
				return;
			}
			
			Node previousNode = head;
			for(int i = 1; i < position-1; i++) {
				previousNode = previousNode.next;
				if(previousNode == null) {
					System.out.println("Invalid position");
					return;
				}
			}
			
			newNode.next = previousNode.next;
			previousNode.next = newNode;
		}
		
	//Delete at the end
		public void deleteAtEnd() {
			if(head == null) {
				System.out.println("List is empty");
				return;
			}
			
			if(head.next == null) {
				head = null;
				return;
			}
			
			Node currentNode = head;
			while(currentNode.next.next != null) {
				currentNode = currentNode.next;
			}
			
			currentNode.next = null;
		}
		
		
	//Delete at the beginning
		
		public void deleteAtBeginning() {
			if(head == null) {
				System.out.println("List is empty");
				return;
			}
			
			head = head.next;
		}
		
	//Delete in the middle
		
		public void deleteAtMiddle(int position) {
			if(head == null) {
				System.out.println("List is empty");
				return;
			}
			
			if(position == 1) {
				head = head.next;
				return;
			}
			
			Node previousNode = head;
			for(int i = 1; i < position-1; i++) {
				previousNode = previousNode.next;
				if(previousNode == null) {
					System.out.println("Invalid position");
					return;
				}
			}
			
			previousNode.next = previousNode.next.next;
		}
		
	//Print linkedList
		
		public void printLinkedList() {
			Node currentNode = head;
			while(currentNode != null) {
				System.out.print(currentNode.value + " ");
				currentNode = currentNode.next;
			}
			System.out.println();
		}
		
	//Search node by key
		
		public void searchByKey(int key) {
			Node currentNode = head;
			int position = 1;
			
			while(currentNode != null) {
				if(currentNode.value == key) {
					System.out.println("Key " + key + " found at position " + position);
					return;
				}
				currentNode = currentNode.next;
				position++;
			}
			
			System.out.println("Key " + key + " not found");
		}
		
	//Sort the LinkedList
		public void sortLinkedList() {
			if(head == null) {
			System.out.println("List is empty");
			return;
			}
			Node currentNode = head;
			while(currentNode != null) {
				Node nextNode = currentNode.next;
				while(nextNode != null) {
					if(currentNode.value > nextNode.value) {
						int temp = currentNode.value;
						currentNode.value = nextNode.value;
						nextNode.value = temp;
					}
					nextNode = nextNode.next;
				}
				currentNode = currentNode.next;
			}
		}

		public static void main(String[] args) {
			LinkedListClass ld = new LinkedListClass();
			
			//Insert at the end
			ld.insertAtEnd(1);
			ld.insertAtEnd(2);
			ld.insertAtEnd(3);
			
			//Insert at the beginning
			ld.insertAtBeginning(0);
			
			//Insert at the middle
			ld.insertAtMiddle(5, 3);
			
			//Print linkedList
			ld.printLinkedList();
			
			//Delete at the end
			ld.deleteAtEnd();
			
			//Delete at the beginning
			ld.deleteAtBeginning();
			
			//Delete in the middle
			ld.deleteAtMiddle(2);
			
			//Print linkedList
			ld.printLinkedList();
			
			//Search node by key
			ld.searchByKey(3);
			
			//Sort the LinkedList
			ld.sortLinkedList();
			
			//Print linkedList
			ld.printLinkedList();
		}
}

	