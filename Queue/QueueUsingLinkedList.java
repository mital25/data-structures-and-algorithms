// Java program for queue using Linked list

class QNode { 
	int key; 
	QNode next; 

	public QNode(int key) 
	{ 
		this.key = key; 
		this.next = null; 
	} 
} 

class Queue1 { 
	QNode front, rear; 

	public Queue1() 
	{ 
		this.front = this.rear = null; 
	} 

	void enqueue(int key) 
	{ 

		QNode temp = new QNode(key); 

		if (this.rear == null) { 
			this.front = this.rear = temp; 
			return; 
		} 

		this.rear.next = temp; 
		this.rear = temp; 
	} 

	void dequeue() 
	{ 
		if (this.front == null) 
			return; 

	//	QNode temp = this.front; 
		this.front = this.front.next; 

		if (this.front == null) 
			this.rear = null; 
	} 
} 

public class QueueUsingLinkedList { 
	public static void main(String[] args) 
	{ 
		Queue1 q = new Queue1(); 
		q.enqueue(10); 
		q.enqueue(20); 
		q.dequeue(); 
		q.dequeue(); 
		q.enqueue(30); 
		q.enqueue(40); 
		q.enqueue(50); 
		q.dequeue(); 
		System.out.println("Queue Front : " + q.front.key); 
		System.out.println("Queue Rear : " + q.rear.key); 
	} 
} 