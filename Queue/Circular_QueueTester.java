package Queue;

public class Circular_QueueTester {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circular_Queue cq = new Circular_Queue(5);
		cq.enqueue(345);
		cq.enqueue(45);
		cq.enqueue(3345);
		cq.enqueue(3457);
		cq.enqueue(50);
		cq.enqueue(4590);
		System.out.println("-------------------------------");
		System.out.println("dequeue ="+ cq.dequeue());
		System.out.println("dequeue ="+ cq.dequeue());
		System.out.println("dequeue ="+ cq.dequeue());
		System.out.println("-------------------------------");
		
		cq.enqueue(35);
		cq.enqueue(37);
		System.out.println("-------------------------------");
		System.out.println("dequeue ="+ cq.dequeue());
		System.out.println("dequeue ="+ cq.dequeue());
		System.out.println("dequeue ="+ cq.dequeue());
		System.out.println("dequeue ="+ cq.dequeue());
		System.out.println("dequeue ="+ cq.dequeue());
		System.out.println("dequeue ="+ cq.dequeue());
		
		
		
		
	}
}
