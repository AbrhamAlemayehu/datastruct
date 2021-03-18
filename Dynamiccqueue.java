package pro4;

public class Dynamiccqueue {

	public static void main(String[] args) {
		
		 DynamicQueueImpl queue = new DynamicQueueImpl();
	        queue.enqueue(4);
	        queue.dequeue();
	        queue.enqueue(56);
	        queue.enqueue(2);
	        queue.enqueue(67);
	        queue.dequeue();
	        queue.enqueue(24);
	        queue.enqueue(56);
	        queue.enqueue(2);
	        queue.enqueue(67);
	        queue.dequeue();
	        queue.enqueue(24);
	        queue.enqueue(98);
	        queue.dequeue();
	        queue.dequeue();
	        queue.dequeue();
	        queue.enqueue(435);
	        queue.dequeue();
	        queue.dequeue();
	        queue.dequeue();
	        queue.dequeue();
	        queue.dequeue();
	        
	        
	    }
	


	}


