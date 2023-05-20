package Queue;

public class Queue_Tester {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// verify if 0 size queue is allowed or not
		Queue qtest = new Queue(0);
		// why 0 size array is allowed ???
		Queue q = new Queue(5);
		q.enqueue(10);
		q.enqueue(50);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(80);
		q.enqueue(95);
		q.dequeue();
		q.dequeue();
		
		System.out.println("right now queue can not reset its value of F & R\n value so can not"
				+ " store again in the vacant spaces\n::  to solve this problem we implement circular queue");
		q.enqueue(10);
		
		
		System.out.println("completed!!");	
	}
}
