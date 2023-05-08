package DataStructures;

public class QueueClass {
	private int front;
	private int rear;
	int size=5;
	int arr[]=new int[size];
	
	QueueClass() {
		front=-1;
		rear=-1;
		
	}
	
	//Checking queue is full or not
	boolean isFull(){
		if(front==0 && rear ==size-1)
		return true;
		return false;
		
	}
	
	//Checking queue is empty or not
	boolean isEmpty() {
		if(front==-1)
		return true;
		else
		return false;
	}
	
	//Adding elements to the queue
	void enQueue(int element) {
		if(isFull()) {
			System.out.println("The queue is full. Cannot able to add elements");
		}else {
			if(front==-1)
				front=0;
			rear++;
			arr[rear]=element;
			System.out.println("Inserted"+element);
		}
	}
	
	int deQueue() 
	{
		int element = 0;
		if(isEmpty()) 
		{
			System.out.println("Queue is empty");
		}else 
		{
			element=arr[front];
			if(front>=rear) 
			{
			front=-1;
			rear=-1;
		    }else 
		    {
			front++;
		    }
		}System.out.println("Deleted: "+element);
		return element;
		}
		
	void display() {
		int i;
		if(isEmpty()) {
			System.out.println("Queue is empyu");
		}else {
			System.out.println("\n Front Index ->"+front);
			System.out.println("Items ->");
			for(i=front;i<rear;i++) {
				System.out.println(arr[i]+" ");
			}
		}
	}
		

	public static void main(String[] args) {
		QueueClass q=new QueueClass();
		
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		
		q.deQueue();
		q.display();
		

	}

}
