package DataStructures;

public class StackClass {
	private int arr[];
	private int top;
	private int capacity;
	
	//Create a stack
	StackClass(int size){
		arr=new int[size];
		capacity=size;
		top=-1;
	}
	
	//Adding values to stack
	public void push(int x) {
		if(isFull()) {
			System.out.println("Stack is full, Can't able to add elements");
			System.exit(1);
		}else
			System.out.println("Adding elements: "+x);
		arr[++top]=x;
	}
	
	//Checking if stack is full or not
	public Boolean isFull(){
		return top==capacity-1;
		
	}
	
	//Removing elements from stack
	public int Pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty, Can't able to remove elements");
			System.exit(1);
		}
		return arr[top--];
	}
	
	//Checking stack is empty or not
	public Boolean isEmpty() {
		return top==-1;
	}
	
	//Printing all elements in the stack
	public void printStack() {
		System.out.println("Elemets in the stack are ");
		for(int i=0;i<=top;i++) {
			System.out.println(arr[i]);
		}
	}
	
	//to print the index of the stack
	public void Size() {
		System.out.println(top);
	}
	
	

	public static void main(String[] args) {
		StackClass sc=new StackClass(5);
		sc.push(1);
		sc.push(2);
		sc.push(3);
		sc.push(4);
		sc.push(5);
		
		sc.Size();
		sc.isFull();
		sc.Pop();
		sc.isEmpty();
		sc.printStack();
		

	}

}
