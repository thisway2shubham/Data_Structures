package Queue;

public class Circular_Queue {

	
	public int [] arr;
	public int front, rear, count;
	
	public Circular_Queue() {
		arr = new int[5];
		front= rear=-1;
		count =0;
		System.out.println("length of array:->"+arr.length);
	}
	public Circular_Queue(int size) {
		arr = new int[size];
		front= rear=-1;
		count =0;
	}
	
	public boolean isEmpty() {
		if(count == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(count == arr.length) {
			return true;
		}
		else {
			return false;
		}
	}
	public void enqueue(int data) {
		if(isFull() == false) 
		{
		rear = (rear+1) % arr.length;
		arr[rear] = data;
		
		if(front==-1)
		{
			front=0;
		}
		count++;
		System.out.print("Count:->"+count+"---&&");
		
		System.out.println("rear-->"+rear);
		System.out.println("Enqueue "+data);
		}
		else {
			System.out.println("Q is full");
			// or throw exception
		}
	}
	public int dequeue() {
		if(isEmpty() == false) {
			int temp = arr[front];
			front = (front + 1) % arr.length;
			System.out.print("Count:->"+count+"---&&");
			System.out.println("Front:-->"+front);
			count--;
			return temp;
		}
		else {
			System.out.println("Q is empty");
			return -999;
			// OR throw exception
		}
	}
	
	
}
