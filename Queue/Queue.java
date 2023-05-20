package Queue;

public class Queue {

	private int[] arr;
	private int front = -1, rear = -1; // F&R->(-1)| 0 | 1 | 2 | 3 | 4 | 5 |

	public Queue() {
		arr = new int[5];
		front = -1;
		rear = -1;
	}

	public Queue(int size) {
		arr = new int[size];
		front = -1;
		rear = -1;
	}

	public boolean isFull() {
		if (rear == (arr.length - 1))
		{
			// queue is full
			System.out.println("Queue is Full");
			return true;
		} 
		else
		{
			return false;
		}
	}

	public boolean isEmpty() 
	{
		if ((front == -1)&& (rear == -1) || (front > rear))
		{
			System.out.println("Queue is empty");
			return true;
			
		} 
		else
			return false;
	}
	
	public int size() {
		return arr.length;
	}

	public void enqueue(int data) 
	{
		if (isFull() == false) 
		{
			rear++;
			arr[rear] = data;
			
			if (front == -1) // check front == -1 means queue is empty 
			{                //then increment front by 1.
				front = 0;
			}
			
			System.out.println("Enqueue:->" + data + " front:--> " + front + " rear:-->" + rear);
		} else 
		{
			// sysout q is full
			System.out.println("Queue is Full!!");
			// OR throw exception
		}
	}

	public int dequeue() {
		if (isEmpty() == false) 
		{
			int temp = arr[front];
			front++;
			System.out.println("Dequeue:->" + temp + " front:-->" + front + " rear:-->" + rear);
			return temp;
		} 
		else
		{
			// q is empty
			System.out.println("q is empty");
			return -999;
			// OR throw an exception
		}
	}
	
	public void enqueue1(int data) 
	{
		if (isFull() == false) 
		{
			rear++;
			arr[rear] = data;
			
			if (front == -1) // check front == -1 means queue is empty 
			{                //then increment front by 1.
				front = 0;
			}
			
			System.out.println("Enqueue:->" + data + " front:--> " + front + " rear:-->" + rear);
		} else 
		{   
			
			// sysout q is full
			System.out.println("Queue is Full!!");
//			// OR throw exception
		}
	}

}
