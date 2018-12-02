package hw7_1;

public class MyArrayStack{
	private int top;
	private int stackSize;
	private int[] itemArray;
	public MyArrayStack() {
		this(5);
	}
	public MyArrayStack(int size) {
		top = -1;
		stackSize = size;
		itemArray = new int[size];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top == stackSize-1);
	} 
	public void push(int item) {
		if(isFull())
			System.out.println("Inserting fail! Array Stack is full!!");
		// 배열을 확장하든지, 예외를 발생시키든지 적절한 처리 필요
		else
			itemArray[++top] = item;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty!!");
			return 0;
			// 예외 발생시켜야 함
		}
		else
			return itemArray[top--];
	}
	public int peek() {
		return itemArray[top];
	}
	@Override
	public String toString() {
		int[] arr=itemArray;
		String s="";
		for(int i=0;i<=top;i++) {
			s+=Integer.toString(arr[i]);
		}
		return s;
	}
	
}